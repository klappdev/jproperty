package org.kl.property.error;

public class PropertyException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	private final String message;

    public PropertyException() {
        this.message = "";
    }

    public PropertyException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}