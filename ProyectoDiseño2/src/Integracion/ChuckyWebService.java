/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Integracion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JeanCarlo
 */
public class ChuckyWebService implements IAdvancedWebService{
    static Thread sent;
    static Thread receive;
    static Socket socket;
    static String date = "";
    
    @Override
    public float invokeBCCRWS() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String invokeChuckyWS() {
        try {
            accessSocket();
        } catch (IOException ex) {
            Logger.getLogger(ChuckyWebService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return date;
    }

    public void accessSocket() throws IOException {
        // TODO code application logic here
        try{
            socket = new Socket("localhost", 8666);
            startThread();
        }
        catch(UnknownHostException ex){
            System.out.println("Error 1");
        }
        catch(IOException ex){
            System.out.println("Connection refused: Connect Server");
        }
    }

    public static void startThread(){
        sent = new Thread(new Runnable() {
            @Override
            public void run() {
                boolean flag = true;
                try{
                    BufferedReader stdIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                    while(flag){
                        System.out.println("Trying to read...");
                        System.out.println("Request sent");
                        String in = stdIn.readLine();
                        date = in;
                        out.print("Try " + "\r\n");
                        out.flush();
                        flag = false;
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
        sent.start();
        try{
            sent.join();
        }
        catch(InterruptedException ie){
            ie.printStackTrace();
        }
    }
}
