package com.mteng.valueObject;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

import org.springframework.stereotype.Component;

@Component
public class Option {

	private Integer id;
	private String value;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
