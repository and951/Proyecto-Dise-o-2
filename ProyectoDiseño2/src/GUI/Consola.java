/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Controller.Observer;
import java.util.Scanner;

/**
 *
 * @author Mariano
 */
public class Consola  {
    
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
            String sistema,moneda,nombre="";
            double monto,plazo,interes=0.00;
            System.out.println("Ingrese su nombre: ");
            nombre = in.nextLine();
            System.out.println("Ingrese el monto: ");
            monto = in.nextDouble();
            System.out.println("Ingrese el plazo: ");
            monto = in.nextDouble();
            System.out.println("Ingrese el interes: ");
            monto = in.nextDouble();
            System.out.println("Ingrese nombre sistema (americano,"
                    + "aleman,frances): ");
            sistema = in.next();
            System.out.println("Ingrese la moneda(colones,dolares):");
            moneda = in.next();
            //Llamada a controlador
        }catch(Exception e){
            System.out.println("Error verique los datos!");
        }
    
    }
    
}
