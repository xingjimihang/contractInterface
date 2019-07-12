package com.mk.entity;

import java.util.Date;

public class SendMessage {
    private String messageguid;
    private Integer receiveusertype;
    private String receiveuserguid;
    private String mobile;
    private String content;
    private Date sendtime;
    private Integer issend;
    private Date actsendtime;
    private Integer sendusertype;
    private String senduserguid;
    private String senduser;

    public String getMessageguid() {
        return messageguid;
    }

    public void setMessageguid(String messageguid) {
        this.messageguid = messageguid;
    }

    public Integer getReceiveusertype() {
        return receiveusertype;
    }

    public void setReceiveusertype(Integer receiveusertype) {
        this.receiveusertype = receiveusertype;
    }

    public String getReceiveuserguid() {
        return receiveuserguid;
    }

    public void setReceiveuserguid(String receiveuserguid) {
        this.receiveuserguid = receiveuserguid;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getSendtime() {
        return sendtime;
    }

    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }

    public Integer getIssend() {
        return issend;
    }

    public void setIssend(Integer issend) {
        this.issend = issend;
    }

    public Date getActsendtime() {
        return actsendtime;
    }

    public void setActsendtime(Date actsendtime) {
        this.actsendtime = actsendtime;
    }

    public Integer getSendusertype() {
        return sendusertype;
    }

    public void setSendusertype(Integer sendusertype) {
        this.sendusertype = sendusertype;
    }

    public String getSenduserguid() {
        return senduserguid;
    }

    public void setSenduserguid(String senduserguid) {
        this.senduserguid = senduserguid;
    }

    public String getSenduser() {
        return senduser;
    }

    public void setSenduser(String senduser) {
        this.senduser = senduser;
    }
}