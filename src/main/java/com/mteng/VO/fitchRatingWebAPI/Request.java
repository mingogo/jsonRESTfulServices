
package com.mteng.VO.fitchRatingWebAPI;

import org.codehaus.jackson.annotate.JsonProperty;

public class Request {

    private LogicalExpression logicalExpression;

	@JsonProperty("LogicalExpression")
    public LogicalExpression getLogicalExpression() {
        return logicalExpression;
    }

    public void setLogicalExpression(LogicalExpression logicalExpression) {
        this.logicalExpression = logicalExpression;
    }

    public Request withLogicalExpression(LogicalExpression logicalExpression) {
        this.logicalExpression = logicalExpression;
        return this;
    }
}
