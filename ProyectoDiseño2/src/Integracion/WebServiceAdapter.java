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
public class WebServiceAdapter implements IWebService {

    IAdvancedWebService advancedWebService;

   public WebServiceAdapter(String pWebServiceType){
   
      if(pWebServiceType.equalsIgnoreCase("bccr") ){
         advancedWebService = new BCCRWebService();			
         
      }else if (pWebServiceType.equalsIgnoreCase("chucky")){
         advancedWebService = new ChuckyWebService();
      }	
   }

   @Override
   public String invoke(String pWebServiceType) {
      if(pWebServiceType.equalsIgnoreCase("bccr")){
         return String.valueOf(advancedWebService.invokeBCCRWS());
      }
      else if(pWebServiceType.equalsIgnoreCase("chucky")){
         return advancedWebService.invokeChuckyWS();
      }
      else return "Error";
   }
}
