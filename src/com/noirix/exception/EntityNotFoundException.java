package com.noirix.exception;

/**/

public class EntityNotFoundException extends RuntimeException {

    private int errorCode;

    public EntityNotFoundException(int errorCode) {
        this.errorCode = errorCode;
    }

    public EntityNotFoundException(String message, int errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public EntityNotFoundException(String message, Throwable cause, int errorCode) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    public EntityNotFoundException(Throwable cause, int errorCode) {
        super(cause);
        this.errorCode = errorCode;
    }

    public EntityNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, int errorCode) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.errorCode = errorCode;
    }
}

