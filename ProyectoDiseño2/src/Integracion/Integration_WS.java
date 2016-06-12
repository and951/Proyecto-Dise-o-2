/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Integracion;

/**
 *
 * @author JeanCarlo
 */
public class Integration_WS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WebService ws = new WebService();
        System.out.println(ws.invoke("chucky"));
        System.out.println(ws.invoke("bccr"));
    }    
}
