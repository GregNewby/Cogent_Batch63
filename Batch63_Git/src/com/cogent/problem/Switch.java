/**
 * 
 */
package com.cogent.problem;

import java.util.Scanner;

/**
 * @author Greg N.
 * @date :
 * 
 */
public class Switch {
	public static void main(String[] args) {
		
		//bigger number
		
		/*
		 * int a; int b;
		 * 
		 * a= 8; b= 9;
		 * 
		 * int c = (a > b) ? (c = a) : (c = b);
		 * 
		 * System.out.println(c);
		 */
		
		//switch numbers
		
		/*
		 * int a = 6; int b = 7;
		 * 
		 * a = a + b; b = a - b; a = a - b;
		 * 
		 * System.out.println(a); System.out.println(b);
		 */
		
		//odd or even
		
		/*
		 *
		 * int x = 8; boolean even; even = (true || false) ? (x % 2 ==0) : (x % 2 != 0)
		 * ;
		 * 
		 * System.out.println(even);
		 */
			
		//consonant or vowel
		
		char x;
		
		x= 'a';
		
		if(x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' || x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U') {
			System.out.println("vowel");
		} else 
			System.out.println("consonant");
	}

}
