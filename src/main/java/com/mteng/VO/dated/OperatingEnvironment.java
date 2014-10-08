package com.mteng.VO.dated;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

import org.springframework.stereotype.Component;

@Component
public class OperatingEnvironment {

	private List<Factor> factors = new ArrayList<Factor>();
	private List<SubFactor> subFactors = new ArrayList<SubFactor>();

	public List<Factor> getFactors() {
		return factors;
	}

	public void setFactors(List<Factor> factors) {
		this.factors = factors;
	}

	public List<SubFactor> getSubFactors() {
		return subFactors;
	}

	public void setSubFactors(List<SubFactor> subFactors) {
		this.subFactors = subFactors;
	}
}