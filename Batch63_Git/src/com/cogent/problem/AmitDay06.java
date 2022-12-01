/**
 * 
 */
package com.cogent.problem;

/**
 * @author Greg N.
 * @date :
 * 
 */
public class AmitDay06 {
	public static void main(String[] args) {
		int[][] twod = new int[3][3];
		
		twod[0][0] = 3;
		twod[1][1] = 3;
		twod[2][2] = 3;
		twod[0][1] = 3;
		twod[1][2] = 3;

		AmitDay05.twoDArray(twod);	
		
		System.out.println();
		
		int[][] threed = new int[4][3];
		
		threed[0][0] = 2;
		threed[1][1] = 2;
		threed[2][2] = 2;
		threed[0][1] = 2;
		threed[1][2] = 2;

		AmitDay05.twoDArray(threed);
	}

//	1. How do you reverse a string in Java?
//	2. Write a Java program to print a Fibonacci sequence using recursion.
//	3. Write a Java program that sorts HashMap by value.
//	4. How do you get distinct characters and their count in a string in Java?
//	5.  How do you show a diamond problem with multiple inheritance in Java?
//	6. Write a program in Java to count the digits in a number.
//	7. Write a program in Java to Toggle the case of every character of a string. For instance, if the input string is “CoGEnt”, the output should be “cOgeNT”.
//	8.Java program to remove duplicate elements from a singly linked list

}
