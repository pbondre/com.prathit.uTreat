package com.prathit.uTreat.model;

import org.codehaus.jettison.json.JSONObject;

public class Supplement {
	///////////////////////////////////////////////////////////////////////////
	// PROPERTIES
	private String name;
	private String manufacturer;
	private String dosage;
	
	///////////////////////////////////////////////////////////////////////////
	// METHODS
	public String toString() {
		return name + ":" + manufacturer + ":" + dosage;
	}
	
	public JSONObject toJSON() {
		return null;
	}
	
	///////////////////////////////////////////////////////////////////////////
	// GETTERS
	public String getName() {
		return name;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public String getDosage() {
		return dosage;
	}
	
	///////////////////////////////////////////////////////////////////////////
	// SETTERS
	public void setName(String name) {
		this.name = name;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public void setDosage(String dosage) {
		this.dosage = dosage;
	}
	
	

}
