
package Integracion;

import java.util.logging.Level;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

//Clase utilitaria que sirve para verificar si un password es debil o es fuerte

public class BCCRConection {

    //Primer linea para deshabilitar warnings
    //Dura como 15 segundos
    public static  boolean calidadContrasenia(String password){
        java.util.logging.Logger.getLogger("com.gargoylesoftware").setLevel(Level.OFF);
        
        WebDriver driver = new HtmlUnitDriver(true);
        driver.get("http://indicadoreseconomicos.bccr.fi.cr/indicadoreseconomicos/Cuadros/frmVerCatCuadro.aspx?idioma=1&CodCuadro=%20400");       
        WebElement response = driver.findElement(By.id("theTable400"));
        System.out.println(response.getText().toString());
        driver.close();
        return true;

    }
    
    
        
        
     
 }//FIN DE CLASE UTILITARIA
    

