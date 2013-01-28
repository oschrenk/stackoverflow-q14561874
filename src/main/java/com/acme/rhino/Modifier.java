package com.acme.rhino;

public class Modifier {

	final String message;
	final int value;

	public Modifier(final String message, final int value) {
		super();
		this.message = message;
		this.value = value;
	}

	public String getMessage() {
		return message;
	}

	public int getValue() {
		return value;
	}
}