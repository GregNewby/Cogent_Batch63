/**
 * 
 */
package com.cogent.problem;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

/**
 * @author Greg N.
 * @date :
 * 
 */
public class AmitDay07 {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		
	}
	
//	1) Given an element, how do you find out whether that element exist in a LinkedList or not. If it exist retrieve the position of that element?
//	2) Write a Java program to traverse the elements of a LinkedList in reverse direction?
//	3) How do you join an ArrayList at the end of a LinkedList?
//	4) Write a Java program which implements LinkedList as a Queue (FIFO)?
	
	
//	5) How do you insert an element at the head and tail of a LinkedList?
	
	// head  list.addFirst(0);
	// tail  list.addLast(0);
	
//	6) How do you add an element or collection of elements at a specific position of a LinkedList?
	
	
	// LinkedList list = new LinkedList();

	// list.add(0, 0);
	
//	7)Write a Java method that will remove a given character from a string object.
	public static String removeChar(String s, String character) {
		String[] r = s.split(character);
		String without = "";
		
		
		for(String string : r) {
			for(int i = 0; i < string.length(); i++) {
				without = without + string.charAt(i);
			}	
		}
		
		return without;
	}
	
//	8)How can you make a String upper case or lower case in Java?
	
	// Using the .toUpperCase or .toLowerCass Function
	
//	9)How do you compare two strings in a Java program?
	
	// using .equals
	
//	10)How To Remove Duplicate Elements From ArrayList In Java?
	public static ArrayList removeDup(ArrayList al) {
		Set al2 = Set.copyOf(al);
		al.clear();
		al.addAll(al2);
		return al;
	}

}
