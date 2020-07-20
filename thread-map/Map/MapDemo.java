package com.xworkz.java.Map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		Map<Integer,Character> map= new HashMap<Integer,Character>();
		map.put(1,'A');
		map.put(2,'B');
		map.put(3,'C');
		map.put(4,'D');
		System.out.println("Is 'A' is present in a Map:"+map.containsValue('A'));
		System.out.println("Get a letter first letter:"+map.get(1));
		System.out.println("Key set of a letter:"+map.keySet());
		System.out.println("Entry set of a Map:"+map.entrySet());
		System.out.println("Is Map contains a Key 1:"+map.containsKey(1));
		
		System.out.println("the Map entries are");
		for(Map.Entry<Integer,Character>e:map.entrySet()) {
			System.out.println(e.getKey()+":"+e.getValue());
		}
		
	}
	
}
