package com.empyra.enums;

public enum ViolationSeverity {
	
	MINOR(1, "Minor"),
	MODERATE(2, "Moderate"),
	MAJOR(3, "Major"),
	CRITICAL(4, "Critical");

	private final int level;
	private final String description;

	ViolationSeverity(int level, String description) {
		this.level = level;
		this.description = description;
	}

	public int getLevel() {
		return level;
	}

	public String getDescription() {
		return description;
	}

}
