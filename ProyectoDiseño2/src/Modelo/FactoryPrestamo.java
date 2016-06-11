/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Felipe Mora
 */
public class FactoryPrestamo implements Modelo.FactoryInterfacer {

    @Override
    public String identificarPrestamo(Sistema sist_Calculo) {
        String sistema;
        if ("Alemán".equals(sist_Calculo.toString()))
        {
            return sistema = "Alemán";
        }else if ("Francés".equals(sist_Calculo.toString()))
        {
            return sistema = "Francés";
        }else if("Americano".equals(sist_Calculo.toString()))
        {
            return sistema = "Americano";
        }        
        return "No valido";
    }

    @Override
    public Prestamo CrearPrestamo(String nombre, double monto_Inicial, double plazo, Moneda moneda, Sistema sist_Calculo, double interesAnual) {
        String prestamo = identificarPrestamo(sist_Calculo);
        if (prestamo.equals("Alemán"))
        {
            return new SistemaAleman(nombre, monto_Inicial, plazo, moneda, sist_Calculo, interesAnual);
        }else if (prestamo.equals("Americano")){
            return new SistemaAmericano(nombre, monto_Inicial, plazo, moneda, sist_Calculo, interesAnual);
        }else if (prestamo.equals("Francés")){
            return new SistemaFrances(nombre, monto_Inicial, plazo, moneda, sist_Calculo, interesAnual);
        }
        //no deberia llegar aca pero se pone como flag
        return null;
    }
    
}
