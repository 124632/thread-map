package com.xworkz.java.Apti;

public class CountNoOfLetters {
	public static void main(String[] args) {
		
		String str = "welcome to x-works";
		System.out.println("String="+str);
		char[] arr = str.toCharArray();
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] !=' ') {
				count++;
			}
		}
		System.out.println("count no of letter is string="+count);
	}

}
