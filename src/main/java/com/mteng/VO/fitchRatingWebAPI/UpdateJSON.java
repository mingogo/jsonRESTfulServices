package com.mteng.VO.fitchRatingWebAPI;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.node.ObjectNode;

public class UpdateJSON {

	public static void main(String[] args){

		ObjectMapper mapper = new ObjectMapper();

		try {

			BufferedReader fileReader = new BufferedReader( new FileReader("/Users/mingogo/Desktop/result.json"));
			JsonNode rootNode = mapper.readTree(fileReader);

			/*** read ***/
			// JsonNode nameNode = rootNode.path("name");
			JsonNode nameNode = rootNode.path("MaxDocumentsToRetrieve");
			System.out.println(nameNode.getTextValue());

			/**
			 * Read the field "Request"
			 */
			JsonNode nameNodeRequest = rootNode.path("Request");
			Object test1 = nameNodeRequest.getElements();

			System.out.println("[mteng:Wait here.]");

			JsonNode ageNode = rootNode.path("age");
			System.out.println(ageNode.getIntValue());

			JsonNode msgNode = rootNode.path("messages");
			Iterator<JsonNode> ite = msgNode.getElements();

			while (ite.hasNext()) {
				JsonNode temp = ite.next();
				System.out.println(temp.getTextValue());

			}

			/*** update ***/
			// ((ObjectNode)rootNode).put("nickname", "new nickname");
			((ObjectNode)rootNode).put("MaxDocumentsToRetrieve", 500L);
			((ObjectNode)rootNode).put("name", "updated name");
			((ObjectNode)rootNode).put("This is bull shit", "This is crzy ass shit");
			((ObjectNode)rootNode).put("This is bull shit", "This is crzy ass shit");
			((ObjectNode)rootNode).put("This is bull shit", "This is crzy ass shit");
			((ObjectNode)rootNode).put("This is bull shit", "This is crzy ass shit");
			((ObjectNode)rootNode).remove("age");

			mapper.writeValue(new File("/Users/mingogo/Desktop/ohohoh.json"), rootNode);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}