package com.xworkz.java.Apti;

public class RemoveSpace {
	public static void main(String[] args) {
		String s1 = "welcome to xworkz";
		System.out.println(s1);
		char[] arr = s1.toCharArray();
		System.out.println("\nRemove space in String....");
		int length = arr.length-1;
		for(int i=0;i<length;i++) {
			if(arr[i]==' ') {
				for(int j=i;j<length;j++) {
					arr[j] = arr[j+1];
				}
				i--;
				length--;
			}
		}
				
				
	}

}
