package com.mk.common;

/**
 * 响应信息
 */
public class Response {
    private Integer status;
    private String message;

    public Response(Integer status,String message){
        this.status = status;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
