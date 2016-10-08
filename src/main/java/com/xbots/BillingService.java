package com.xbots;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
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
   
   @POST
	@Path("/tokens")
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public String getTokenValue(@QueryParam("userId") String userId ,@QueryParam("token") String token ,@Context HttpServletResponse servletResponse){
	      return "200";
	}
}
