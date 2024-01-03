package com.exception.bankexample;

public class InvalidOptionException extends Exception {
    public InvalidOptionException(String message) {
        super(message);
    }
}