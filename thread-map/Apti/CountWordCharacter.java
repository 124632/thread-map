package com.xworkz.java.Apti;

public class CountWordCharacter {
	public static void main(String[] args) {
		String s1= "Welcome to X-works";
		System.out.println("String="+s1);
		wordCharacter(s1);
	}
   
	static void wordCharacter(String s1) {
		char[] arr = s1.toCharArray();
		System.out.println("count word each word of count in String");
		
		for(int i=0;i<arr.length;i++) {
			String a="";
		while(i<arr.length && arr[i]!=' ') {
			a+=arr[i];
			i++;
		}
		if(a.length()>0) {
			System.out.println(a+"="+a.length());
		}
	}
	}
}