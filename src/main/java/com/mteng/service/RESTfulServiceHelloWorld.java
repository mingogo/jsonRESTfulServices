package com.mteng.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/hello")
public class RESTfulServiceHelloWorld{

	@GET
	public Response responseMsg() {

		//String output = "Hello World"; 
		//String output = " Hello World, I've done some changes. And another changes, yeah. "; 
		String output = "Coming back to the church."; 
		return Response.status(200).entity(output).build();
	}
}
