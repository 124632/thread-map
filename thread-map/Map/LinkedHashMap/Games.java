package com.xworkz.java.Map.LinkedHashMap;

public class Games {
	String name;
    double points;
    
    public Games(String name,double points) {
    	this.name=name;
    	this.points=points;
    }

	@Override
	public String toString() {
		return "Games [name=" + name + ", points=" + points + "]";
	}
    

}
