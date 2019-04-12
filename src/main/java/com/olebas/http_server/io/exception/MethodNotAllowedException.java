package com.olebas.http_server.io.exception;

import com.olebas.http_server.io.Constants;

public class MethodNotAllowedException extends AbstractRequestParseFailedException {

    public MethodNotAllowedException(String method, String startingLine) {
        super("Only " + Constants.ALLOWED_METHODS + " are supported. Current method is " + method, startingLine);
        setStatusCode(405);
    }
}
