package com.xworkz.java.Apti;

public class UpperCase { 
	public static void main(String[] args) {
		String str = "transformer";
		System.out.println("String="+str);
		  for(int i=0;i<str.length();i++) {
			  if(str.charAt(i)>96 && str.charAt(i)<123)
				  System.out.print((char)(str.charAt(i)-32));
			  else
				  System.out.print(str.charAt(i));  
		  }
	}

}
