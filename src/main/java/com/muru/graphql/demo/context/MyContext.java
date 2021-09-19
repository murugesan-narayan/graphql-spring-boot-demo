package com.muru.graphql.demo.context;

import org.springframework.http.HttpHeaders;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;

public class MyContext {
    private final String customState = "Custom state!";
    private final Map<String, ?> map;
    private final HttpHeaders httpHeaders;
    private final WebRequest webRequest;

    public MyContext(Map<String, ?> map, HttpHeaders httpHeaders, WebRequest webRequest) {
        this.map = map;
        this.httpHeaders = httpHeaders;
        this.webRequest = webRequest;
    }

    public Map<String, ?> getMap() {
        return map;
    }

    public HttpHeaders getHttpHeaders() {
        return httpHeaders;
    }

    public WebRequest getWebRequest() {
        return webRequest;
    }

    public String getCustomState() {
        return customState;
    }
}
