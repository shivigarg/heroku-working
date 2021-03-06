package com.xbots;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/BillingService")
public class BillingService {

   BillingInfoDao billingInfoDao = new BillingInfoDao();

     
   @GET
   @Path("/users/{userid}")
   @Produces(MediaType.APPLICATION_JSON)
   public BillingInfo getUser(@PathParam("userid") String userid){
      return billingInfoDao.getBillAmount(userid);
   }
   
}
