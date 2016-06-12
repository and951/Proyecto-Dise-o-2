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
public class WebService implements IWebService {
   WebServiceAdapter webServiceAdapter; 

   @Override
   public String invoke(String pWebServiceType) {		
      
      if(pWebServiceType.equalsIgnoreCase("bccr") || pWebServiceType.equalsIgnoreCase("chucky")){
         webServiceAdapter = new WebServiceAdapter(pWebServiceType);
         return webServiceAdapter.invoke(pWebServiceType);
      }
      else{
         return "Invalid Web Service. " + pWebServiceType + " Type is not supported yet";
      }
   }   
}
