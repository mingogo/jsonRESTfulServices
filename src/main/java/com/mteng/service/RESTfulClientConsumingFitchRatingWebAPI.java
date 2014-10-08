package com.mteng.service;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.mteng.beans.PrettyPrints;
import com.mteng.updated_JSON_VOs.*;

//TODO: Should feed the JSON built by MasterJSONbuilder. 
public class RESTfulClientConsumingFitchRatingWebAPI {

	PrettyPrints prettyPrints = new PrettyPrints();
	MasterJsonObjectBuilder masterJsonObjectBuilder = new MasterJsonObjectBuilder();

	public static void main(String[] args){
		RESTfulClientConsumingFitchRatingWebAPI rs = new
				RESTfulClientConsumingFitchRatingWebAPI();
		rs.resultingJson();
	};


	public String resultingJson(){

		String fitchRatingWebApiUrl = "http://nycvmdevapps01.fitch.corp:88/api/Search";
		String jsonFileLocation = masterJsonObjectBuilder.toString();
		String output = null;
		String indentedResult = null;
		String userNameInHeader = "lfuller";

		try {
			Client client = Client.create();
			WebResource webResource = client.resource(fitchRatingWebApiUrl);

			/**
			 * 
			 * If you want to read JSON from file....
			 * 
			// JSONParser parser = new JSONParser();
			// JSONObject jsonObject = (JSONObject) parser.parse(new FileReader(jsonFileLocation));
			// String input = jsonObject.toJSONString();
			 */

			/**
			 * Or read it from the master builder...
			 */
			String input = masterJsonObjectBuilder.resultingJSON();

			if(input != null){
				System.out.println("[mteng] Input Success.");
			};

			/**
			 * Pretty print the input JSON.
			 */
			// String indentedInputResult = prettyPrints.resultingJson(input);
			// System.out.println("Input JSON:" +jsonFileLocation+ "\n"+ indentedInputResult + "\n--");

			ClientResponse response = null;

			response = webResource.header("userName",userNameInHeader).header("Content-Type", "application/json").post(ClientResponse.class, input);

			System.out.println("Result Headers:");
			System.out.println(response);
			System.out.println(response.getHeaders());

			output = response.getEntity(String.class);

			indentedResult = prettyPrints.resultingJson(output);
			System.out.println("Result JSON:");
			System.out.println(indentedResult);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return output;
	};
}