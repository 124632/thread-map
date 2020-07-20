package com.xworkz.java.Map;

public class Doctor {
 private String name;
 String specialist;
 int yoe;
 
 public Doctor(String name,String specialist,int yoe) {
	 this.setName(name);
	 this.specialist=specialist;
	 this.yoe=yoe;
 }

@Override
public String toString() {
	return "Doctor [name=" + getName() + ", specialist=" + specialist + ", yoe=" + yoe + "]";
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
 
}
