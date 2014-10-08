package com.mteng.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mteng.updated_JSON_VOs.MasterJsonObjectBuilder;

@Component
public class OutputHelper {

	@Autowired
	MasterJsonObjectBuilder masterJsonObjectBuilder;

	public void output(){
		masterJsonObjectBuilder.resultingJSON();
	};
}