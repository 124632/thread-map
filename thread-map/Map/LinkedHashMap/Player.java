package com.xworkz.java.Map.LinkedHashMap;

public class Player {
	String name;
	int age;
	
	public void player(String name,int age) {
		this.name=name;
		this.age=age;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", age=" + age + "]";
	}
	

}
