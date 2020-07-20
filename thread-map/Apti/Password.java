package com.xworkz.java.Apti;

public class Password {
	public static void main(String[] args) {
		Password password = new Password();
		String pasw = "Xworkz123";
		password.passwordCheck(pasw);
	}
	

	void passwordCheck(String pasw) {
		char[] arr = pasw.toCharArray();
		for(int k=0;k<arr.length;k++) {
			System.out.println(arr[k]);
		}
		System.out.println("");
		int count = 0;
		int coun = 0;
		int cou = 0;
		int c = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=48 && arr[i]<=57) {
				count++;
				
			} 
			else if(arr[i]>=65 && arr[i]<=90) {
				count++;
			} 
			else if(arr[i]>=97 && arr[i]<=122) {
				count++;
			}
			else if(arr[i]>=32 && arr[i]<=47 || arr[i]>=58 && arr[i]<=64 || arr[i]>=91 && arr[i]<=96 
					||arr[i]>=123 && arr[i]<=126) {
				c++;
			}
		}
		if(count > 0 && coun >0 && cou >0 && c>0) {
			System.out.println("password is valid");
		}
		else {
			System.out.println("password is wrong.....");
		}
		System.out.println("\nNumber 0 to 9="+ count);
		System.out.println("Uppercase A to Z="+ coun);
		System.out.println("Lowercase a to z="+ cou);
		System.out.println("Special character="+ c);
		System.out.println("password is correct...."+pasw);
	}

}
