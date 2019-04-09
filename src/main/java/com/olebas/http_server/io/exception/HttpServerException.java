package com.olebas.http_server.io.exception;

public class HttpServerException extends RuntimeException {

    private int statusCode = 500;

    public HttpServerException(String message) {
        super(message);
    }

    public HttpServerException(String message, Throwable cause) {
        super(message, cause);
    }

    public HttpServerException(Throwable cause) {
        super(cause);
    }
}
