/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BCCR_WS;

import java.text.SimpleDateFormat;
import java.util.Date;
import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Nodes;

/**
 *
 * @author JeanCarlo
 */
public class ObtenerTipoDeCambio {
    public float getCambioDeCompra(){
        float cambioCompra = 0;
        try {
            cambioCompra = obtenerTipoCambioCompra();
            //System.out.println("Tipo de cambio venta: " + obtenerTipoCambioVenta());
            //System.out.println("Tipo de cambio compra: " + obtenerTipoCambioCompra());
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        return cambioCompra;
    }
    
    public static float obtenerTipoCambioVenta() throws Exception { //318
        return Float.parseFloat(invocarWebService("318"));
    }

    public static float obtenerTipoCambioCompra() throws Exception { //317
        return Float.parseFloat(invocarWebService("317"));
    }
    
    public static String invocarWebService(String indicador) throws Exception {
        // Esta parte es para obtener la fecha actual y enviarla como parámetro
        // al web service
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        String fechaActual = dateFormat.format(date);        

        // Se invoca al método del web service y se guarda el resultado XML en res
        // Las clases que se utilizan fueron generadas por Apache Axis WSDL2Java
        WsIndicadoresEconomicosLocator ws = new WsIndicadoresEconomicosLocator();
        String res;
        WsIndicadoresEconomicosSoap soap = ws.getwsIndicadoresEconomicosSoap();
        res = soap.obtenerIndicadoresEconomicosXML(indicador, fechaActual, fechaActual, "null", "null");
        
        // Navegar por el XML para obtener el dato requerido
        Builder parser = new Builder();
        Document doc = parser.build(res, null);
        Nodes nodos = doc.query("//Datos_de_INGC011_CAT_INDICADORECONOMIC//INGC011_CAT_INDICADORECONOMIC//NUM_VALOR");
        
        return nodos.get(0).getValue();    
    }
}
