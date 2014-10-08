package com.mteng.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.mteng.VO.updated_JSON.MasterJsonObjectBuilder;

@Path("/sendbackjson")
public class RESTfulServiceSendBackSameJSONasRequest {

	MasterJsonObjectBuilder masterJsonObjectBuilder = new MasterJsonObjectBuilder();

	/**
	 * 
	 * @return a predefined JSON
	 */
	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public Response returnJSON_GET() {
		String result = (String) masterJsonObjectBuilder.resultingJSON();
		return Response.status(200).entity(result).build();
	}

	/**
	 * 
	 * @param Must be JSON
	 * @return The very same JSON in the request
	 */
	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response returnJSON_POST(String input) {
		String result = (String) masterJsonObjectBuilder.resultingJSON();
		return Response.status(200).entity(result).build();
	}
}
