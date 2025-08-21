package com.empyra.enums;

public enum BuildingName {
	L('L'),
	M('M'),
	N('N'),
	O('O'),
	P('P'),
	Q('Q'),
	R('R');
	
	private final char bldgLetter;

	private BuildingName(char bldg) {
		this.bldgLetter = bldg;
	}

	public char getBldgLetter() {
		return bldgLetter;
	}
	
}
