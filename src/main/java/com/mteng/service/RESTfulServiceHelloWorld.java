package com.mteng.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/hello")
public class RESTfulServiceHelloWorld{

	@GET
	public Response responseMsg() {

		String output = "Hello World"; 
		return Response.status(200).entity(output).build();
	}
}
