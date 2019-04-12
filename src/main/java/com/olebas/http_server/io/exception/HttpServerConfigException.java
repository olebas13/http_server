package com.olebas.http_server.io.exception;

public class HttpServerConfigException extends HttpServerException {

    public HttpServerConfigException(String message) {
        super(message);
    }

    public HttpServerConfigException(String message, Throwable cause) {
        super(message, cause);
    }

    public HttpServerConfigException(Throwable cause) {
        super(cause);
    }
}
