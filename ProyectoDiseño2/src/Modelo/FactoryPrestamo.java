/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Felipe Mora
 * @Collaborator Andrés Jiménez 
 */
public class FactoryPrestamo implements Modelo.FactoryInterfacer {

    @Override
    public String identificarPrestamo(Sistema sist_Calculo) {
       return sist_Calculo.toString();
    }

    @Override
    public Prestamo CrearPrestamo(String nombre, double monto_Inicial, double plazo, Moneda moneda, Sistema sist_Calculo, double interesAnual) {
         switch(sist_Calculo){
            case Alemán:
                return new SistemaAleman(nombre, monto_Inicial, plazo, moneda, sist_Calculo, interesAnual);
            case Americano:
                return new SistemaAmericano(nombre, monto_Inicial, plazo, moneda, sist_Calculo, interesAnual);
            case Francés:
                return new SistemaFrances(nombre, monto_Inicial, plazo, moneda, sist_Calculo, interesAnual);
            default:
                return null;
           }
      
    }
    
}
