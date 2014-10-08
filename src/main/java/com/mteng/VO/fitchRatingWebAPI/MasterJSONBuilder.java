package com.mteng.VO.fitchRatingWebAPI;

import java.util.ArrayList;
import java.util.List;

import com.mteng.beans.ObjectToJSON;
import com.mteng.beans.PrettyPrints;
import com.mteng.beans.WriteJSONToFile;

public class MasterJSONBuilder {
	public static void main(String[] args) {
		MasterJSONBuilder masterJSONBuilder = new MasterJSONBuilder();
		masterJSONBuilder.resultingJSON();
	}

	public String resultingJSON(){
		/**
		 * Instantiations
		 */
		MasterJSON masterJSON = new MasterJSON();
		Request request = new Request();
		ObjectToJSON objectToJSON = new ObjectToJSON();
		PrettyPrints prettyPrints = new PrettyPrints();
		LogicalExpression logicalExpression = new LogicalExpression();

		List<LogicalRelationalExpression> logicalRelationalExpressions = new
				ArrayList<LogicalRelationalExpression>(){
			{
				List<Object> relationalExpressions = new ArrayList<Object>(){
					{
						RelationalExpression relationalExpression1 = new RelationalExpression();
						relationalExpression1.setKey("RNI_Banks|MetaData|EntityInfo|IssuerID");
						relationalExpression1.setRelationalOperator("EQ");
						relationalExpression1.setValue(94171890L);
						RelationalExpression relationalExpression2 = new RelationalExpression();
						relationalExpression2.setKey("RNI_Banks|MetaData|EntityInfo|IssuerID");
						relationalExpression2.setRelationalOperator("EQ");
						relationalExpression2.setValue(3L);
						add(relationalExpression1);
						add(relationalExpression2);
					}
				};

				LogicalRelationalExpression logicalRelationalExpressions1 = new LogicalRelationalExpression();
				logicalRelationalExpressions1.setLogicalOperator("OR");
				logicalRelationalExpressions1.setRelationalExpression(relationalExpressions);

				add(logicalRelationalExpressions1);
				/*
				 * 
				 */
				List<Object> relationalExpressions2 = new ArrayList<Object>(){
					{
						RelationalExpressionWithStringValue relationalExpression1a = new
								RelationalExpressionWithStringValue();

						relationalExpression1a.setKey("RNI_Banks|MetaData|VersionID|Tool");
						relationalExpression1a.setRelationalOperator("EQ");
						relationalExpression1a.setValue("RN");
						add(relationalExpression1a);

						RelationalExpressionWithStringValue relationalExpression2a = new
								RelationalExpressionWithStringValue();
						relationalExpression2a.setKey("RNI_Banks|MetaData|Workflow|Approved|ApproverName");
						relationalExpression2a.setRelationalOperator("EQ");
						relationalExpression2a.setValue("wknight");
						add(relationalExpression2a);
					}
				};

				LogicalRelationalExpression logicalRelationalExpressions2 = new LogicalRelationalExpression();
				logicalRelationalExpressions2.setLogicalOperator("AND");
				logicalRelationalExpressions2.setRelationalExpression(relationalExpressions2);

				add(logicalRelationalExpressions2);
			}
		};

		logicalExpression.setLogicalOperator("AND");
		logicalExpression.setLogicalRelationalExpressions(logicalRelationalExpressions);
		request.setLogicalExpression(logicalExpression);
		/**
		 * Level: MasterJSON
		 */

		List<String> ProjectionFields = new ArrayList<String>(){
			{
				add("RNI_Banks|MetaData|EntityInfo|IssuerName");
				add("RNI_Banks|MetaData|EntityInfo|Region");
				add("RNI_Banks|MetaData|Workflow|ThisRatingAction|RatingActionDate");
				add("RNI_Banks|MetaData|Workflow|Published|External_Report_ID");
				add("RNI_Banks|MetaData|Workflow|Published|PublishDate");
				add("RNI_Banks|MetaData|EntityInfo|AgentID");
				add("RNI_Banks|ThisEntity|ThisRatingAction[VR]|Rating|Value");
				add("RNI_Banks|ThisEntity|ThisRatingAction[VR]|Factors[OpEnv]|Rating|Value");
				add("RNI_Banks|ThisEntity|ThisRatingAction[VR]|Factors[OpEnv]|SubFactors[EconEnv]|Rating|Value");
				add("RNI_Banks|ThisEntity|ThisRatingAction[VR]|Factors[OpEnv]|SubFactors[FinMkts]|Rating|Value");
				add("RNI_Banks|ThisEntity|ThisRatingAction[VR]|Factors[OpEnv]|SubFactors[RegFrame]|Rating|Value");
				add("RNI_Banks|ThisEntity|ThisRatingAction[VR]|Factors[CmpnyProfile]|Rating|Value");
				add("RNI_Banks|ThisEntity|ThisRatingAction[VR]|Factors[CmpnyProfile]|SubFactors[Franchise]|Rating|Value");
				add("RNI_Banks|ThisEntity|ThisRatingAction[VR]|Factors[CmpnyProfile]|SubFactors[BisModel]|Rating|Value");
				add("RNI_Banks|ThisEntity|ThisRatingAction[VR]|Factors[OpEnv]|Rating|Alert|Type");
				add("RNI_Banks|ThisEntity|ThisRatingAction[VR]|Factors[OpEnv]|Rating|Alert|Value");
			}
		};

		masterJSON.setMaxDocumentsToRetrieve(5L);
		masterJSON.setRequest(request);
		masterJSON.setProjectionFields(ProjectionFields);

		/**
		 * Convert the MasterJsonObject to JSON
		 */
		String output = (String) objectToJSON.convertedJSON(masterJSON);

		/**
		 * Pretty print the result
		 */
		String Indentedoutput = (String) prettyPrints.resultingJson(output);
		System.out.println(Indentedoutput);
		// System.out.println(output);

		/*
		 * Write resulted JSON to file
		 */
		// WriteJSONToFile writeJSONToFile = new WriteJSONToFile();
		// writeJSONToFile.convertedJSON(output);

		return Indentedoutput;
	}
}