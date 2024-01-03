package com.exception;

public class CustomException extends Exception {

    private static final long serialVersionUID = 1L;

    public CustomException(String message) {
        // Call the parent class constructor
        super(message);
    }

}