package com.mteng.VO.fitchRatingWebAPI;

import org.codehaus.jackson.annotate.JsonProperty;

public class RelationalExpression {

	private String key;
	private String relationalOperator;
	private Long value;

	@JsonProperty("Key")
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public RelationalExpression withKey(String key) {
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

	public RelationalExpression withRelationalOperator(String relationalOperator) {
		this.relationalOperator = relationalOperator;
		return this;
	}

	@JsonProperty("Value")
	public Long getValue() {
		return value;
	}

	public void setValue(Long value) {
		this.value = value;
	}

	public RelationalExpression withValue(Long value) {
		this.value = value;
		return this;
	}
}
