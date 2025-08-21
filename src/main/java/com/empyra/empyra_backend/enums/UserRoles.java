package com.empyra.empyra_backend.enums;

import java.util.Arrays;
import java.util.List;

public enum UserRoles {

	
	ADMIN(1, "Admin"),
	SECURITY(2, "Security"),
	MAINTENANCE(3, "Maintenance"),
	UNIT_OWNER(4, "Unit Owner"),
	UNIT_RENTER(5, "Unit Renter"),
	THIRD_PARTY(6, "Third Party");

	private final int code;
	private final String description;

	UserRoles(int code, String description) {
		this.code = code;
		this.description = description;
	}

	public int getCode() {
		return code;
	}

	public String getDescription() {
		return description;
	}
	
	//return a list of all roles
	public static List<UserRoles> getAllRoles() {
		return Arrays.asList(UserRoles.values());
	}
	
}
