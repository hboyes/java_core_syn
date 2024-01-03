package com.exception;

class UnderAgeException extends Exception {
	UnderAgeException() {
		super("You are under age");
	}
	UnderAgeException(String message) {
		super(message);
	}
}

public class Voter {
	public static void main(String[] args) throws UnderAgeException {
		int age = 17;
		if (age<=18) {
			throw new UnderAgeException();
		}
		else {
			System.out.println("You can vote");
		}
	}

}
