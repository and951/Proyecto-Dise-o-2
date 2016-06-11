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
public class SistemaFrances extends Prestamo{

    public SistemaFrances(String nombre, double monto_Inicial, double plazo, Moneda moneda, Sistema sist_Calculo, double interesAnual) {
        super(nombre, monto_Inicial, plazo, moneda, sist_Calculo, interesAnual);
    }

    //Interes_SK
    @Override
    public double Obtener_SK(double deuda) {
        return deuda * (interes_Anual)/100;
    }

    //Amortizacion_VK
    @Override
    public double Calcular_VK() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void LlenarTabla() {
        double monto = monto_Inicial;
        for (int i = 0; i < plazo; i++)
        {
            RegistroAmort r = new RegistroAmort();
            r.interes_SK = Obtener_SK(monto);
            double potencia = Math.pow((1+interes_Anual), plazo);
            r.cuota_CK = monto_Inicial / plazo;
            r.amortizacion_VK = r.cuota_CK - Obtener_SK(r.deuda);
            r.deuda = (monto  + r.interes_SK) - r.cuota_CK;
            r.nPeriodo = i+1;
            tabla.add(r);
            monto = r.deuda;
            System.out.println("deuda"+r.deuda);
        }
    }
    
    
}
