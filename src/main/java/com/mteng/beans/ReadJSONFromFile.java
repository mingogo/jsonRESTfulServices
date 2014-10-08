package com.mteng.beans;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mteng.beans.PrettyPrints;

@Component
public class ReadJSONFromFile {

	@Autowired
	PrettyPrints prettyPrints;

	private String jsonFileLocation = "/Users/mingogo/Desktop/newjson.json";

	public String getJsonFileLocation() {
		return jsonFileLocation;
	}

	public void setJsonFileLocation(String jsonFileLocation) {
		this.jsonFileLocation = jsonFileLocation;
	}

	public String outputInputJSON(){

		JSONParser parser = new JSONParser();

		JSONObject jsonObject = null;

		try {
			jsonObject = (JSONObject) parser.parse(new FileReader(jsonFileLocation));
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}

		String input = jsonObject.toJSONString();
		// String indented = prettyPrints.resultingJson(input);

		// System.out.println("\n" + "InputJSON, location: " + jsonFileLocation + "\n");
		// System.out.println(indented);

		return input;
	};

	public JSONObject outputInputJSON(String inputFileLocation){

		JSONParser parser = new JSONParser();

		JSONObject jsonObject = null;

		try {
			jsonObject = (JSONObject) parser.parse(new FileReader(inputFileLocation));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}

		// String input = jsonObject.toJSONString();
		String input = jsonObject.toJSONString();
		// String indented = prettyPrints.resultingJson(input);

		// System.out.println("\n" + "InputJSON, location: " + jsonFileLocation + "\n");
		// System.out.println(indented);

		// return input;
		return jsonObject;
	};
}
