package com.mteng.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.mteng.beans.PrettyPrints;
import com.mteng.beans.ReadJSONFromFile;

@Path("/json")
public class RESTfulClient { 

	public static void main(String[] args){
		RESTfulClient rESTfulClient = new RESTfulClient();
		System.out.println(rESTfulClient.resultingJson());
	};

	PrettyPrints prettyPrints = new PrettyPrints();
	ReadJSONFromFile readJSONInput = new ReadJSONFromFile();

	@GET
	@Path("/get")
	public String resultingJson(){

		String URL = "http://localhost:8080/JSONRESTful-0.0.2/rest/sendbackjson/post";
		String output = null;

		try {
			Client client = Client.create();

			WebResource webResource = client.resource(URL);

			String input = readJSONInput.outputInputJSON();
			System.out.println("Input JSON:" +readJSONInput.getJsonFileLocation()+ "\n"+
					prettyPrints.resultingJson(input) + "\n--");

			ClientResponse response = webResource.header("Content-Type",
					"application/json").post(ClientResponse.class, input);

			System.out.println("Result Headers:");
			System.out.println(response);
			System.out.println(response.getHeaders());

			/**
			 * Retrieve the json output from response as string 
			 */
			output = response.getEntity(String.class);

			System.out.println("Result JSON:");
			System.out.println(prettyPrints.resultingJson(output));

		} catch (Exception e) {
			e.printStackTrace();
		}
		return output;
	};
}