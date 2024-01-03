package com.exception;

public class Main {

    public static void validateAge(int age) throws CustomException {
        if(age < 18) {
            throw new CustomException("Age is below 18, not valid.");
        } else {
            System.out.println("Age is valid.");
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(15);
        } catch(CustomException ex) {
            System.out.println("Caught the exception: " + ex.getMessage());
        }
    }
}