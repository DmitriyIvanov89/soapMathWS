package ru.divanov.exceptions;

import ru.divanov.dto.ErrorResponseMessage;

public class QuadraticEducationException extends RuntimeException {

    private static final long serialVersionUID = 1L;
    private ErrorResponseMessage errorResponseMessage;

    public QuadraticEducationException(String message) {
        super(message);
    }

    public QuadraticEducationException(String message, ErrorResponseMessage errorResponseMessage) {
        super(message);
        this.errorResponseMessage = errorResponseMessage;
    }

    public QuadraticEducationException(String message, Throwable cause, ErrorResponseMessage errorResponseMessage) {
        super(message, cause);
        this.errorResponseMessage = errorResponseMessage;
    }

    public ErrorResponseMessage getErrorResponseMessage() {
        return errorResponseMessage;
    }

    public void setErrorResponseMessage(ErrorResponseMessage errorResponseMessage) {
        this.errorResponseMessage = errorResponseMessage;
    }
}
