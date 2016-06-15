/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Controller.Administrador;
import Modelo.Moneda;
import Modelo.Prestamo;
import Modelo.Sistema;
import java.util.Scanner;

/**
 *
 * @author Mariano
 */
<<<<<<< HEAD
public class Consola {
    Administrador administradorDelControlador;

    public Consola() {
        administradorDelControlador = new Administrador();
    }
=======
public class Consola  {
>>>>>>> 3be55c4664a3ea29fd300de0fbc45b635bf452d3
    
    public void menu(){
        Scanner in = new Scanner(System.in);
        int opcion=-1;
        try{
            while (opcion!=2){
                System.out.println("\n\t\t Bienvenido\n\n");
                System.out.println("Ingrese # opcion a escoger\n"
                        + "1) Crear Prestamo\n2) Salir ");
                opcion = in.nextInt();
                if (opcion==1){
                    
                    menuAux();
                }
                if (opcion==2){
                    System.out.println("Hasta Luego");
                    return;
                }

            }
        }catch(Exception e){
            System.out.println("Favor escriba un numero");
        }
    }
    
    private void menuAux(){
        Scanner in = new Scanner(System.in);
        try{
            String nombre="";
            Integer numeroSistema, numeroMoneda;
            Sistema sistema;
            Moneda moneda;
            double monto,plazo,interes;
            System.out.println("Ingrese su nombre: ");
            nombre = in.nextLine();
            System.out.println("Ingrese el monto: ");
            monto = in.nextDouble();
            System.out.println("Ingrese el plazo: ");
            plazo = in.nextDouble();
            System.out.println("Ingrese el interes: ");
            interes = in.nextDouble();
            System.out.println("Ingrese el numero del tipo de sistema deseado: \n1.Alemán"
                    + "\n2.Frances \n3.Americano");
            numeroSistema = Integer.parseInt(in.next())-1;
            sistema = Sistema.values()[numeroSistema];
          
            System.out.println("Ingrese el numero del tipo moneda deseado: \n1.Colones \n2.Dolares");
            numeroMoneda = Integer.parseInt(in.next())-1;
            moneda = Moneda.values()[numeroMoneda];
            
            Prestamo prestamoActual = administradorDelControlador.crearPrestamo(nombre, monto, plazo, moneda, sistema, interes);
            System.out.println(administradorDelControlador.escribirArchivo(prestamoActual));
        }catch(Exception e){
            System.out.println("Error verique los datos!");
        }
    
    }
    
}
