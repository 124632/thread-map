package com.xworkz.java.Apti;

public class Occured {
	public static void main(String[] args) {
		String st = "entertainment";
		char[] ch = st.toCharArray();
		for(int i=0;i<st.length();i++) {
			if(ch[i]!=' ') {
              int count=1;
			for(int j=i+1;j<st.length();j++) {
				
				if(ch[i]==' ') {
					break;
				}
				else {
					if(ch[i]==ch[j]) {
						count++;
						ch[j]=' ';
						
					}
				}
			}
			System.out.println(ch[i]+"-->"+count);
			}
			
			
		}
		
	}

}
