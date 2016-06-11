
package GUI;

import Integracion.BCCRConection;
import Modelo.FactoryPrestamo;
import javax.swing.UIManager;

public class Main {
    public static void main(String[] args) {
            boolean flag=BCCRConection.calidadContrasenia("Contrasseee");
            System.out.println(flag);
          //FactoryPrestamo factory = new FactoryPrestamo();
          //Prestamo sa = factory.CrearPrestamo("luis", 1000000, 5, Moneda.Colones, Sistema.Americano, 15);
          //System.out.println(sa.toString());
        
    }
}
