package com.xworkz.java.Map;

public class Patient {
	private String name;
	String disease; 
    int age;
    
    public Patient(String name,String disease, int age) {
    	this.setName(name);
    	this.disease=disease;
    	this.age=age;
    }

	@Override
	public String toString() {
		return "Patient [name=" + getName() + ", disease=" + disease + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
}
