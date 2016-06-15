/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Modelo.Moneda;
import Modelo.Sistema;

/**
 *
 * @author Mariano
 */
public class ControladorGrafico {
    Moneda moneda=null;
    Sistema sistema=null;
    public String creaPrestamo(String nombre,String tipoPrestamo,float monto,int periodo,String moneda) {
            
            if (esNombreValido(nombre) && esMonedaValida(moneda) && esTipoPrestamoValido(tipoPrestamo))
            {
                /*
                if (!contextPrestamo.executeStrategyRevisarMin(monto, periodo, mmoneda))
                {
                    return "La cuenta no cumple con las condiciones!";
                }
                else
                {
                    Prestamo cuenta= contextPrestamo.executeCrearPrestamo(nombre, ttipoPrestamo, monto, periodo, mmoneda);
                    return cuenta.toString();
                }**/
            }
            else {
                return "Por favor verifique los datos!";
            }
            return "";
        }
        private boolean esNombreValido(String nombre)
        {
            if (nombre.equalsIgnoreCase(""))
            {
                return false;
            }
            else {
                return true;
            }
        }
        private boolean esTipoPrestamoValido(String tipoPrestamo)
        {
            if (tipoPrestamo.equals("aleman") )
            {
                
                sistema = Sistema.Alemán;
                
                return true;
            }
            if (tipoPrestamo.equals("frances"))
            {
                sistema=Sistema.Francés;
                return true;
            }
            if (tipoPrestamo.equals("americano")){
            
                sistema=Sistema.Americano;
                //contextPrestamo = new ContextPrestamo(new OperacionesPlazo());
                //ttipoPrestamo = TipoPrestamo.Plazo;
                return true;
            }
            else
            {
                return false;
            }
        }

        private boolean esMonedaValida(String tipoPrestamo)
        {
            if (tipoPrestamo.equals("colones") )
            {
                moneda=Moneda.Colones;
                return true;
            }
            
            if (tipoPrestamo.equals("dolares"))
            {
                moneda = Moneda.Dolares;
                return true;
            }
            else
            {
                return false;
            }
        }
    
    
}
