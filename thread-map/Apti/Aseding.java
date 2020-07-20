package com.xworkz.java.Apti;

public class Aseding {
	public static void main(String[] args) {
		String str = "entertainment";
		asendingString(str);
	}

	private static void asendingString(String str) {
		char[] arr = str.toCharArray();
		for(int i=0;i<arr.length;i++) {
			char temp = 0;
			for(int j=i+1;j<arr.length;j++)
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
		}
		
	}
	

}
