/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Integracion.Integration_WS;
import Integracion.WebService;
import Modelo.FactoryInterfacer;
import Modelo.FactoryPrestamo;
import Modelo.Moneda;
import Modelo.Prestamo;
import Modelo.Sistema;
import java.util.Date;

/**
 *
 * @author Andres
 */
public class Administrador {
    private String tipoDeCambio;
    private String fecha;
    private FactoryInterfacer factory;
    private Integration_WS integration;
    private WebService webService;
    
    public Administrador(){
        factory = new FactoryPrestamo();
        integration = new Integration_WS();
        webService = new WebService();
    }
    public Prestamo crearPrestamo(String nombre, double monto_Inicial, double plazo, Moneda moneda, Sistema sist_Calculo, double interesAnual){
        return factory.CrearPrestamo(nombre, monto_Inicial, plazo, moneda, sist_Calculo, interesAnual);
    }
    public String escribirArchivo(Prestamo prestamo){
        this.actualizarFecha();
        this.actualizarTipodDeCambio();
        String mensaje = "Tipo de cambio compra BCCR: "+this.tipoDeCambio+"1\n";
        mensaje+=prestamo.toString();
        mensaje+="\nChucky Date and Time: "+ fecha;
        return mensaje;
        
    }
    public void escribirPantalla(){
        
    }
    
    public void actualizarTipodDeCambio(){
       this.tipoDeCambio=webService.invoke("bccr");
    }
    public void actualizarFecha(){   
       this.fecha=webService.invoke("chucky");    
    }
  
}
