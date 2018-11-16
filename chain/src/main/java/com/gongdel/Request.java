package com.gongdel;

public class Request {

    private RequestType requestType;
    private String requestDescription;

    public Request(RequestType requestType, String requestDescription) {
        this.requestType = requestType;
        this.requestDescription = requestDescription;
    }

    public String getRequestDescription() {
        return requestDescription;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    @Override
    public String toString() {
        return getRequestDescription();
    }
}
