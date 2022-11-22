/**
 * 
 */
package com.cogent.problem;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Greg N.
 * @date :
 * 
 */
public class Practice_11_22_22 {
	public static void main(String[] args) {
	
	}

	//remove all occurrences of given character from a string
	public static String removeChar(String s, String character) {
		
		String[] s2 = s.split(character);
		String s3 = s2[0];
		
		for(int i = 1; i < s2.length; i++) {
			s3 = s3 + s2[i];
		}
		
		System.out.println(s3);
		return s3;
	}
	
	//switch numbers
	
			/*
			 * int a = 6; int b = 7;
			 * 
			 * a = a + b; b = a - b; a = a - b;
			 * 
			 * System.out.println(a); System.out.println(b);
			 */

	//remove whitespace from a string
	public static String removeWhitespace(String s) {
		String[] s2 = s.split(" ");
		String s3 = s2[0];
		
		for(int i = 1; i < s2.length; i++) {
			s3 = s3 + s2[i];
		}
		
		System.out.println(s3);
		
		return s3;
	}
	
	//check if 2 arrays have same elements
	public static boolean sameIntArray(int[] ar1, int[] ar2) {
		boolean equals = false;
		
		if(ar1.length!=ar2.length) {
			return false;
		}
		for(int i=0; i < ar1.length; i++ ) {
			if(ar1[i]!=ar2[i]) {
				return false;
			}
		}
		return true;
	}
	
	//return 3 largest element in an array
	public static int thirdLargest(int[] ar1) {
		Arrays.sort(ar1);
		
		if(ar1.length>=3) {
			return ar1[ar1.length-3];
		}
		
		else return ar1[0];
	}
	
	//sort Hashmap by using values
	public static LinkedHashMap sortedByValues(Map map) {
		
		map.entrySet().stream().forEach(System.out::println);
		
		Comparator<Entry<String,Integer>> valComp = new Comparator<Entry<String,Integer>>() {
			@Override
			public int compare(Entry<String,Integer> o1, Entry<String,Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		};
		
		LinkedHashMap<String,Integer> sortedM = (LinkedHashMap)map;
		
		System.out.println("After Sorted ---------------");
		
		sortedM.entrySet().stream().sorted(valComp).forEach(System.out::println);
		
		return sortedM;
	}
	
	
	
}

