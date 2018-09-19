package br.com.hackerhanck;

import java.util.HashSet;

public class CostDollar {
	
	static int stringConstruction(String s) {
		HashSet<Character> set = new HashSet<Character>();
		for(int i=0; i<s.length(); i++) {
			char[] c = s.toCharArray();
	        for(char ch: c) 
	            set.add(ch);
		}
		return set.size();
    }

	public static void main(String[] args) {
		//String s = "abab";
		String s = "abcd";
		System.out.println(stringConstruction(s));
	}
}
