package com.test.hackerrank;

public class AlternatingCharacters {

	public static void main(String[] args) {
		String s="AAABBBAABB";
		System.out.println(alternatingCharacters(s));

	}
	
	public static int alternatingCharacters(String s) {
		int count=0;
		char temp=s.charAt(0);
		for(int i=1; i<s.length(); i++) {
			if(s.charAt(i)==temp) {
				count++;
			}else {
				temp=s.charAt(i);
			}
			
		}
		
		return count;
    }
}
