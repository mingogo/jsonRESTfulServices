package com.mteng.VO.dated;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

import org.springframework.stereotype.Component;

@Component
public class Factor {

    private Integer id;
    private String value;
    // private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    /**
     * 
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
     */
}
