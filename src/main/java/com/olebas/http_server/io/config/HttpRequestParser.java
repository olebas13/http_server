package com.olebas.http_server.io.config;

import com.olebas.http_server.io.HttpRequest;
import com.olebas.http_server.io.exception.HttpServerException;

import java.io.IOException;
import java.io.InputStream;

public interface HttpRequestParser {

    HttpRequest parseHttpRequest(InputStream inputStream, String remoteAddress) throws IOException, HttpServerException;

}
