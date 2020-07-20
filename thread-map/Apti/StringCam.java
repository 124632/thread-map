package com.xworkz.java.Apti;

public class StringCam { 
	public static void main(String[] args) {
		String s="Welcome to xworkz";
		for(int i=0;i<s.length();i++) {
			if(i==0 || s.charAt(i-1)==' ') {
				if(s.charAt(i)>=97) {
					System.out.print((char)(s.charAt(i)-32));
				} else {
					System.out.print(s.charAt(i));
				}
			}
			else {
				System.out.print(s.charAt(i));
			}
		}
	}

}
