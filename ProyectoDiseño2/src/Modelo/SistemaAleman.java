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
public class SistemaAleman extends Prestamo {

    public SistemaAleman(String nombre, double monto_Inicial, double plazo, Moneda moneda, Sistema sist_Calculo, double interesAnual) {
        super(nombre, monto_Inicial, plazo, moneda, sist_Calculo, interesAnual);
    }

    @Override
    public double Obtener_SK(double monto) {
        return monto * (interes_Anual/100);
    } 

    @Override
    public double Calcular_VK() {
        return monto_Inicial / plazo;
    }

    @Override
    public void LlenarTabla() {
        double monto = monto_Inicial;
        for (int i = 0 ; i < plazo ; i++)
        {
            RegistroAmort r = new RegistroAmort();
            r.interes_SK = Obtener_SK(monto);
            r.amortizacion_VK = Calcular_VK();
            r.cuota_CK = r.interes_SK + r.amortizacion_VK;
            r.nPeriodo = i+1;
            tabla.add(r);
            r.deuda = (monto + r.interes_SK) - r.cuota_CK ;
            monto = r.deuda;
        }
    }
    
}
