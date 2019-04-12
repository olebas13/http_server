package com.olebas.http_server.io.config;

import com.olebas.http_server.io.HttpResponse;

import java.util.Map;

public interface ReadableHttpResponse extends HttpResponse {

    int getStatus();

    Map<String, String> getHeaders();

    byte[] getBody();

    boolean isBodyEmpty();

    int getBodyLength();

}
