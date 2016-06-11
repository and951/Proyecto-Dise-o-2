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
public class RegistroAmort {
    public int nPeriodo;
    public double interes_SK;
    public double deuda;
    public double amortizacion_VK;
    public double cuota_CK;

    public RegistroAmort()
    {
        this.nPeriodo = 0;
        this.interes_SK = 0;
        this.deuda = 0;
        this.amortizacion_VK = 0;
        this.cuota_CK = 0;
    }
    
    public RegistroAmort(int nPeriodo, double interes_SK, double deuda, double amortizacion_VK, double cuota_CK) {
        this.nPeriodo = nPeriodo;
        this.interes_SK = interes_SK;
        this.deuda = deuda;
        this.amortizacion_VK = amortizacion_VK;
        this.cuota_CK = cuota_CK;
    }

    @Override
    public String toString() {
        return nPeriodo + "            " + deuda + "            " + interes_SK +
                "          " + amortizacion_VK + "              " + cuota_CK + "\n";
    }
    
    
    
}
