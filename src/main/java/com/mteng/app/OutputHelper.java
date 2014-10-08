package com.mteng.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mteng.VO.updated_JSON.MasterJsonObjectBuilder;

@Component
public class OutputHelper {

	@Autowired
	MasterJsonObjectBuilder masterJsonObjectBuilder;

	public void output(){
		masterJsonObjectBuilder.resultingJSON();
	};
}