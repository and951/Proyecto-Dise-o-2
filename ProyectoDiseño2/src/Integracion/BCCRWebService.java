/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Integracion;

import BCCR_WS.ObtenerTipoDeCambio;
/**
 *
 * @author JeanCarlo
 */
public class BCCRWebService implements IAdvancedWebService{

    @Override
    public float invokeBCCRWS() {
        ObtenerTipoDeCambio obtenerTipoDeCambio = new ObtenerTipoDeCambio();
        return obtenerTipoDeCambio.getCambioDeCompra();
    }

    @Override
    public String invokeChuckyWS() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
