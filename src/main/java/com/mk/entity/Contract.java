package com.mk.entity;

public class Contract {
    private String contractguid;
    private String projectguid;
    private String projectcode;
    private String projectname;
    private String bidguid;
    private String bidcode;
    private String bidname;

    public Contract(){}

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public String getContractguid() {
        return contractguid;
    }

    public void setContractguid(String contractguid) {
        this.contractguid = contractguid;
    }

    public String getProjectguid() {
        return projectguid;
    }

    public void setProjectguid(String projectguid) {
        this.projectguid = projectguid;
    }

    public String getProjectcode() {
        return projectcode;
    }

    public void setProjectcode(String projectcode) {
        this.projectcode = projectcode;
    }

    public String getBidguid() {
        return bidguid;
    }

    public void setBidguid(String bidguid) {
        this.bidguid = bidguid;
    }

    public String getBidcode() {
        return bidcode;
    }

    public void setBidcode(String bidcode) {
        this.bidcode = bidcode;
    }

    public String getBidname() {
        return bidname;
    }

    public void setBidname(String bidname) {
        this.bidname = bidname;
    }
}
