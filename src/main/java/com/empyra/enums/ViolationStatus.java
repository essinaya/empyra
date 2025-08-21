package com.empyra.enums;

public enum ViolationStatus {
	
	OPEN(1, "Open"),
	CLOSED(2, "Closed");

	private final int code;
	private final String description;

	ViolationStatus(int code, String description) {
		this.code = code;
		this.description = description;
	}

	public int getCode() {
		return code;
	}

	public String getDescription() {
		return description;
	}

}
