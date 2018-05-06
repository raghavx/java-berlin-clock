package com.ubs.opsit.interviews;

public enum Lights {

	Yellow("Y"), Red("R"), Off("O");

	private String representation;

	private Lights(String value) {
		representation = value;
	}

	public String getRepresentation() {
		return representation;
	}
	
	@Override
	public String toString() {
		return representation;
	}
	
	
	
}
