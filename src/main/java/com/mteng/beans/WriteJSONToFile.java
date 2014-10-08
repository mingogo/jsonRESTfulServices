package com.mteng.beans;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Component;

@Component
public class WriteJSONToFile {
	// public Object convertedJSON(Object input){
	public void convertedJSON(Object input){

		ObjectMapper mapper = new ObjectMapper();
		// Object output = null;

		try {
			/**
			 * Uncomment this if you want to write it to a file
			 */
			mapper.writeValue(new File("/Users/mingogo/Desktop/resultTEST.json"), input);

			// output = mapper.writeValueAsString(input);

		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("[mteng:DONE.]");
		};

		// return output;
	};
}
