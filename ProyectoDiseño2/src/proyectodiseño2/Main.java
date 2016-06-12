/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodiseño2;

import GUI.Consola;
import GUI.JFramePantallaInicial;

/**
 *
 * @author Andres
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //boolean flag=BCCRConection.calidadContrasenia("Contrasseee");
           // System.out.println(flag);
          //FactoryPrestamo factory = new FactoryPrestamo();
          //Prestamo sa = factory.CrearPrestamo("luis", 1000000, 5, Moneda.Colones, Sistema.Americano, 15);
          //System.out.println(sa.toString());
        
        Consola consola=new Consola();
        consola.menu();
        
        JFramePantallaInicial jf= new JFramePantallaInicial();
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
    }
    
}
