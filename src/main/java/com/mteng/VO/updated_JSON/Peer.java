package com.mteng.VO.updated_JSON;

public class Peer {

    private String name;
    private OperatingEnvironment_ operatingEnvironment;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Peer withName(String name) {
        this.name = name;
        return this;
    }

    public OperatingEnvironment_ getOperatingEnvironment() {
        return operatingEnvironment;
    }

    public void setOperatingEnvironment(OperatingEnvironment_ operatingEnvironment) {
        this.operatingEnvironment = operatingEnvironment;
    }

    public Peer withOperatingEnvironment(OperatingEnvironment_ operatingEnvironment) {
        this.operatingEnvironment = operatingEnvironment;
        return this;
    }

}
