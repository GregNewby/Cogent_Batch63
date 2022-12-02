/**
 * 
 */
package com.cogent.problem;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.w3c.dom.Node;

/**
 * @author Greg N.
 * @date :
 * 
 */
public class AmitDay06 {
	public static void main(String[] args) {
	
		String s = "HLKsmAsH";
		
		System.out.println(revCase(s));
	}

//	1. How do you reverse a string in Java?
	public static String rev(String s) {
		String rev = "";
		
		for(int i = s.length() -1; i>= 0; i--) {
			rev = rev + s.charAt(i);
		}
		 return rev;
	}
	
//	2. Write a Java program to print a Fibonacci sequence using recursion.
	public static int fibonacci(int fib) {
		if(fib <= 1) {
			return fib;
		}			
		return fibonacci(fib-2) + fibonacci(fib-1);		
	}
	
//	3. Write a Java program that sorts HashMap by value.
	public static HashMap sortByValue(HashMap map) {
		
		map.entrySet().stream().sorted(Entry.comparingByValue()).forEach(System.out::println);
		return map;
	}
	
//	4. How do you get distinct characters and their count in a string in Java?
	/*
	 * {	
	 * 
	 * String s;
	 * s.indexOf('y')
	 *
	 * }
	 */
	
//	5.  How do you show a diamond problem with multiple inheritance in Java?
//	6. Write a program in Java to count the digits in a number.
	public static int digitsInNum(int i) {
		String length = String.valueOf(i);
		
		return length.length();
	}
	
//	7. Write a program in Java to Toggle the case of every character of a string. For instance, if the input string is “CoGEnt”, the output should be “cOgeNT”.
	public static String revCase(String s) {
		String toggled = "";
		for(int i = 0; i < s.length(); i++) {
			String s2 = String.valueOf(s.charAt(i));
	
			if(String.valueOf(s.charAt(i)).equals(s2.toUpperCase())) { // if it is capital
				toggled = toggled + s2.toLowerCase();
	
			} else {
				toggled = toggled + s2.toUpperCase();
				
			}
			//System.out.println(toggled);
		}
		
		return toggled;
	}
	
//	8.Java program to remove duplicate elements from a singly linked list


}
