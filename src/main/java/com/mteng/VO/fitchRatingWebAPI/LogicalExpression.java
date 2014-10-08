package com.mteng.VO.fitchRatingWebAPI;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

public class LogicalExpression {

	private String logicalOperator;
	private List<LogicalRelationalExpression> logicalRelationalExpressions = new ArrayList<LogicalRelationalExpression>();

	@JsonProperty("LogicalOperator")
	public String getLogicalOperator() {
		return logicalOperator;
	}
	public void setLogicalOperator(String logicalOperator) {
		this.logicalOperator = logicalOperator;
	}
	@JsonProperty("LogicalRelationalExpressions")
	public List<LogicalRelationalExpression> getLogicalRelationalExpressions() {
		return logicalRelationalExpressions;
	}
	public void setLogicalRelationalExpressions(
			List<LogicalRelationalExpression> logicalRelationalExpressions) {
		this.logicalRelationalExpressions = logicalRelationalExpressions;
	}

}
