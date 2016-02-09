package com.prithvi.rest;

import javax.ws.rs.GET;  
import javax.ws.rs.Path;  
import javax.ws.rs.PathParam;  
import javax.ws.rs.Produces;  
import javax.ws.rs.core.MediaType;  
   
@Path("ConvService")  
public class RestImpl {  
     @GET  
     @Path("/InchToFeet/{i}")  
      @Produces(MediaType.TEXT_XML)  
      public String convertInchToFeet(@PathParam("i") int i) {  
   
        int inch=i;  
        double feet = 0;  
        feet =(double) inch/12;  
        
        return "<InchToFeetService>"  
        + "<Inch>" + inch + "</Inch>"  
          + "<Feet>" + feet + "</Feet>"  
         + "</InchToFeetService>";  
      }  
   
      @Path("/FeetToInch/{f}")  
      @GET  
      @Produces(MediaType.TEXT_XML)  
      public String convertFeetToInch(@PathParam("f") double f) {  
    	  double inch=0;  
    	  double feet = f;  
          inch = 12*feet;  
     
          return "<FeetToInchService>"  
            + "<Feet>" + feet + "</Feet>"  
            + "<Inch>" + inch + "</Inch>"  
            + "</FeetToInchService>";  
      }  
}  
