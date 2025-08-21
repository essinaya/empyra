package com.empyra.empyra_backend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Unit {

	@Id
	@GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
	private long id;
	//put in enum
	private char building;
	private int unitNumber;
	private int floor;
	//reference from User.java, concat FN, MN, and LN
	private String owner;
	private String renter;
	private boolean occupied;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public char getBuilding() {
		return building;
	}
	public void setBuilding(char building) {
		this.building = building;
	}
	public int getUnitNumber() {
		return unitNumber;
	}
	public void setUnitNumber(int unitNumber) {
		this.unitNumber = unitNumber;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getRenter() {
		return renter;
	}
	public void setRenter(String renter) {
		this.renter = renter;
	}
	public boolean isOccupied() {
		return occupied;
	}
	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}
	
}
