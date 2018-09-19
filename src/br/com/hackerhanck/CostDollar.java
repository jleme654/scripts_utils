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
	
	/*
	 * Solution II
	 * 
	 * public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    for(int a0 = 0; a0 < n; a0++){
	        String s = in.next();
	        Set<Character> aiseHi = new HashSet<>();
	        char[] c = s.toCharArray();
	        for(char ch: c) {
	            aiseHi.add(ch);
	        }
	        System.out.println(aiseHi.size());
	    }
	   }*/
}
