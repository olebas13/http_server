package com.olebas.http_server.io.exception;

public class HttpVersionNotSupportedException extends AbstractRequestParseFailedException {

    public HttpVersionNotSupportedException(String message, String startingLine) {
        super(message, startingLine);
        setStatusCode(505);
    }

}
