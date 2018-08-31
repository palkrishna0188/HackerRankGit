package com.test.hackerrank;

import java.util.Arrays;

public class MakingAnagrams {

	public static void main(String[] args) {
		String s1="showman";
		String s2="woman";
		System.out.println(MakingAnagrams.makeAnagram(s1, s2));
	}
	
	public static int makeAnagram(String a, String b) {
		int count=0,c1,c2;
		char[] ch1=a.toCharArray();
		char[] ch2=b.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		a=String.valueOf(ch1);
		b=String.valueOf(ch2);
		
		while(a.length() != 0) {
			c1=0;
			c2=0;
			for(int i=0; i< a.length(); i++) {
				if(a.charAt(i)==a.charAt(0)) {
					c1++;
				}
			}
			for(int j=0; j< b.length(); j++) {
				if(b.charAt(j)==a.charAt(0)) {
					c2++;
				}
			}
			if(c1 > 0 && c2 > 0) {
				if(c1>c2) {
					count=count+c1-c2;
					b=b.replaceAll(String.valueOf(a.charAt(0)), "");
					a=a.replaceAll(String.valueOf(a.charAt(0)), "");
				}else if(c2 > c1) {
					count= count+ c2-c1;
					b=b.replaceAll(String.valueOf(a.charAt(0)), "");
					a=a.replaceAll(String.valueOf(a.charAt(0)), "");
				}else {
					b=b.replaceAll(String.valueOf(a.charAt(0)), "");
					a=a.replaceAll(String.valueOf(a.charAt(0)), "");
				}
			}else {
				count=count+c1;
				a=a.replaceAll(String.valueOf(a.charAt(0)), "");
			}
		}
        return count+b.length();
    }

}
