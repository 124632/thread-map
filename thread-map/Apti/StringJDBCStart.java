package com.xworkz.java.Apti;

public class StringJDBCStart {
	public static void main(String[] args) {
		String s = "welcome to x-works are you there";
		char[] ch = s.toCharArray();
		int start = 0;
		int len = 0;
		int i=1;
		for( ;i<ch.length-1;i++) {
			if(ch[i]==' ' && ch[i+1]!=' ') {
				len = i-start;
				System.out.println(len);
				start=i+1;
			}
		System.out.println(i-start+1);
	}
  }
}
