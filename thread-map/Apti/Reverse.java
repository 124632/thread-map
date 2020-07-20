package com.xworkz.java.Apti;

public class Reverse {
	public static void main(String[] args) {
		String str = "transformer";
		char[] arr = str.toCharArray();
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		System.out.println("\nAfter reverse String........");
		for(int j=arr.length-1;j>=0;j--) {
			System.out.print(arr[j]+" ");
		}
	}
	

}
