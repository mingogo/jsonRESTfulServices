
package com.mteng.VO.fitchRatingWebAPI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * 
 * @author mteng
 *
 */
public class LogicalRelationalExpression {

	private String logicalOperator;
	private List<Object> relationalExpression = new ArrayList<Object>();

	@JsonProperty("LogicalOperator")
	public String getLogicalOperator() {
		return logicalOperator;
	}
	public void setLogicalOperator(String logicalOperator) {
		this.logicalOperator = logicalOperator;
	}
	@JsonProperty("RelationalExpression")
	public List<Object> getRelationalExpression() {
		return relationalExpression;
	}
	public void setRelationalExpression(List<Object> relationalExpression) {
		this.relationalExpression = relationalExpression;
	}
}
