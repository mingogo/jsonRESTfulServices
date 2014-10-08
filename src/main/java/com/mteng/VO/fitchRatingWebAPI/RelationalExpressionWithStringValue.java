package com.mteng.VO.fitchRatingWebAPI;

import org.codehaus.jackson.annotate.JsonProperty;

public class RelationalExpressionWithStringValue {

	private String key;
	private String relationalOperator;
	private String value;

	@JsonProperty("Key")
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public RelationalExpressionWithStringValue withKey(String key) {
		this.key = key;
		return this;
	}

	@JsonProperty("RelationalOperator")
	public String getRelationalOperator() {
		return relationalOperator;
	}

	public void setRelationalOperator(String relationalOperator) {
		this.relationalOperator = relationalOperator;
	}

	public RelationalExpressionWithStringValue withRelationalOperator(String relationalOperator) {
		this.relationalOperator = relationalOperator;
		return this;
	}

	@JsonProperty("Value")
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public RelationalExpressionWithStringValue withValue(String value) {
		this.value = value;
		return this;
	}
}