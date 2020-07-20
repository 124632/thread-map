package com.xworkz.java.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap<Character,Integer> lhm = new LinkedHashMap<Character,Integer>();
		lhm.put('A', 65);
		lhm.put('B', 66);
		lhm.put('C', 67);
		lhm.put('D', 68);
		
		for(Map.Entry<Character,Integer>AsciiEntry : lhm.entrySet()) {
		    System.out.println("ASCII value of"+AsciiEntry.getKey()+" : "+AsciiEntry.getValue());	
		}
	}

}
