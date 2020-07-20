package com.xworkz.java.Apti;

public class RemoveDuplicate {
	public static void main(String[] args) {
		String str = "entertainment";
		char[] ch = str.toCharArray();
		
		
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i] == ch[j]) {
					ch[i]=' ';
				}
			}
		}
		for(int k=0;k<ch.length;k++) {
			if(ch[k]==' ') {
				
			}
			else {
				System.out.print(ch[k]);
			}
		}
		
	}

}
