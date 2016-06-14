/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
/**
 *
 * @author Felipe Mora
 */

public abstract class Prestamo {
    
    protected String nombre;
    protected double monto_Inicial;
    protected double plazo;
    protected Moneda moneda;
    protected double interes_Anual;
    protected Sistema sist_Calculo;
    protected ArrayList<RegistroAmort> tabla;

    public Prestamo(String nombre, double monto_Inicial, double plazo, Moneda moneda, Sistema sist_Calculo, double interesAnual) {
        this.nombre = nombre;
        this.monto_Inicial = monto_Inicial;
        this.plazo = plazo;
        this.moneda = moneda;
        this.sist_Calculo = sist_Calculo;
        this.interes_Anual = interesAnual;
        tabla = new ArrayList<RegistroAmort>();
        LlenarTabla();
    }
    
    public abstract double Obtener_SK(double deuda);
    public abstract double Calcular_VK();
    public abstract void LlenarTabla();
    
    //toString de la clase
    //Nota: Recordar que el tipo de cambio se agrega al inicio desde el Strategy
    //y el chuky se agrega al final
    @Override
    public String toString()
    {
        int interesTT = 0;
        int amortizacionTT = 0;
        int cuotaTT = 0;
        String totales;
        String datos = "Datos de Consulta: \n" + "Cliente: " + nombre + "\n" 
                + "Monto del préstamo otorgado: " + monto_Inicial + "\n" 
                + "Plazo del préstamo: " + plazo + "\n" + "Interés anual: " +
                interes_Anual + "\n" + "Sistema de amortización: " + 
                sist_Calculo + "\n" + "\n" + "Tabla de Amortización" + "\n" + 
                "Período K    Deuda inicial   Intereses (SK)   Amortización (VK)   Cuota(CK) \n";
        for (int i = 0; i < plazo ; i++)
        {
            String dTabla = tabla.get(i).toString();
            interesTT += tabla.get(i).interes_SK;
            amortizacionTT += tabla.get(i).amortizacion_VK;
            cuotaTT += tabla.get(i).cuota_CK;
        }
        totales = "\n Totales: \n Interes: " + interesTT + "  Amortizacion: " + amortizacionTT + "  Cuotas: " + cuotaTT;
        return datos + tabla + totales;
    }
    
    
    
    
}
