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
public class SistemaAmericano extends Prestamo{

    public SistemaAmericano(String nombre, double monto_Inicial, double plazo, Moneda moneda, Sistema sist_Calculo, double interesAnual) {
        super(nombre, monto_Inicial, plazo, moneda, sist_Calculo, interesAnual);
    }

    @Override
    public double Obtener_SK(double deuda) {
        return deuda * (interes_Anual/100);
    }

    @Override
    public double Calcular_VK() {
        return monto_Inicial;
    }

    @Override
    public void LlenarTabla() {
        double deuda = monto_Inicial;
        for (int i = 0; i < plazo; i++)
        {
            RegistroAmort r = new RegistroAmort();
            r.nPeriodo = i+1;
            r.interes_SK = Obtener_SK(deuda);
            if (i == plazo-1)
            {
                r.amortizacion_VK = Calcular_VK();
            }else{
                r.amortizacion_VK = 0;
            }
            r.cuota_CK = r.amortizacion_VK + r.interes_SK;
            deuda = r.deuda = deuda - r.cuota_CK + r.interes_SK;
            tabla.add(r);
        }
    }
    
    
}
