package com.empyra.empyra_backend.enums;

public enum UnitRequestCategory {

	ELECTRICAL("Electrical"),
	PLUMBING("Plumbing"),
	GENERAL_COMPLAINT("General Complaint"),
	MAINTENANCE("Maintenance"),
	OTHER("Other");
	
	private final String categoryDescription;
	
	UnitRequestCategory(String description) {
		this.categoryDescription = description;
	}

	public String getCategoryDescription() {
		return categoryDescription;
	}
	
}
