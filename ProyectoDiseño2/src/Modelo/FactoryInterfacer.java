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
public interface FactoryInterfacer {
    
    public String identificarPrestamo(Sistema sist_Calculo);
    public Prestamo CrearPrestamo(String nombre, double monto_Inicial, double plazo, Moneda moneda, Sistema sist_Calculo, double interesAnual);    
}
