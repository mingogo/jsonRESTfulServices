package com.mteng.VO.fitchRatingWebAPI;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

public class MasterJSON {

	private Long maxDocumentsToRetrieve;
	private Request request;
	private List<String> projectionFields = new ArrayList<String>();

	@JsonProperty("MaxDocumentsToRetrieve")
	public Long getMaxDocumentsToRetrieve() {
		return maxDocumentsToRetrieve;
	}
	public void setMaxDocumentsToRetrieve(Long maxDocumentsToRetrieve) {
		this.maxDocumentsToRetrieve = maxDocumentsToRetrieve;
	}
	@JsonProperty("Request")
	public Request getRequest() {
		return request;
	}
	public void setRequest(Request request) {
		this.request = request;
	}
	@JsonProperty("ProjectionFields")
	public List<String> getProjectionFields() {
		return projectionFields;
	}
	public void setProjectionFields(List<String> projectionFields) {
		this.projectionFields = projectionFields;
	}

}