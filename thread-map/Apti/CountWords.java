package com.xworkz.java.Apti;

public class CountWords {
	public static void main(String[] args) {
		String s1 = "welcome to xworkz";
		System.out.println(s1);
		char[] arr = s1.toCharArray();
		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			if((arr[i]!=' ') && (i>0) && (arr[i-1]==' ') || (arr[0]!=' ') && (i==0))
             
                  count++;
		}
		System.out.println("count no of words in String="+count);
	}

}
