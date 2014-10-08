package com.mteng.service;

import java.io.FileReader;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.mteng.beans.PrettyPrints;

/**
 * A Jersey client reads a JSON file as input, and feeds it to FitchRating Web
 * API and produces resulting JSON using a POST method.
 * 
 * Such client is also exposed as a POST web service. It can be accessed as
 * follows:
 * http://localhost:8081/JerseySpringIntergration/rest/JerseyClient/post
 * 
 * @return The result JSON is "pretty printed" in the console.
 * @author mteng
 */
//@Component
@Path("/JerseyClient")
public class RESTfulClientReadingJSONfromFileAndConsumingWebAPI {
	public static void main(String[] args){
		RESTfulClientReadingJSONfromFileAndConsumingWebAPI rs = new
		RESTfulClientReadingJSONfromFileAndConsumingWebAPI();
		rs.resultingJson();
	};

//	@Autowired
	PrettyPrints prettyPrints = new PrettyPrints();

	@POST
	@Path("/post")
	public String resultingJson(){

		String fitchRatingWebApiUrl = "http://nycvmdevapps01.fitch.corp:88/api/Search";
		// String jsonFileLocation = "c://request.json";
		String jsonFileLocation = "/Users/mingogo/Desktop/request.json";
		String output = null;
		String indentedResult = null;
		String userNameInHeader = "lfuller";

		try {
			Client client = Client.create();

			WebResource webResource =
					client.resource(fitchRatingWebApiUrl);

			JSONParser parser = new JSONParser();

			JSONObject jsonObject = (JSONObject) parser.parse(new
					FileReader(jsonFileLocation));

			String input = jsonObject.toJSONString();
			System.out.println(input);

			/**
			 * Pretty print the input JSON.
			 */
			String indentedInputResult = prettyPrints.resultingJson(input);

			System.out.println("Input JSON:" +jsonFileLocation+ "\n"+ indentedInputResult
			+ "\n--");

			ClientResponse response =
					webResource.header("userName",userNameInHeader).header("Content-Type",
							"application/json").post(ClientResponse.class, input);

			/**
			 * Comment the following if you don't want to check the result headers in the
			 * console.
			 */
			System.out.println("Result Headers:");
			System.out.println(response);
			System.out.println(response.getHeaders());

			/**
			 * Retrieve the json output from response as string 
			 */
			output = response.getEntity(String.class);

			/**
			 * Comment the follows if you don't want to pretty print resulting json in
			 * the console
			 */
			indentedResult = prettyPrints.resultingJson(output);
			System.out.println("Result JSON:");
			System.out.println(indentedResult);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return output;
	};
}
