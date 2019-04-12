package com.olebas.http_server.io.exception;

public class BadRequestException extends AbstractRequestParseFailedException {

    public BadRequestException(String message, Throwable cause, String startingLine) {
        super(message, cause, startingLine);
        setStatusCode(400);
    }
}
