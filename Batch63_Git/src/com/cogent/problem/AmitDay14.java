/**
 * 
 */
package com.cogent.problem;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Greg N.
 * @date : 12-13-22
 * 
 */
public class AmitDay14 {
	public static void main(String[] args) {
		System.out.println(perfectSquare(22));
	}
	
//Q1).Java Program to calculate the Average of number taken from user.
	public static void averageNum() {
		Scanner scanner = new Scanner(System.in);
		int numOfNum;
		int average = 0;
		System.out.print("How many numbers are you going to enter: ");
		numOfNum = scanner.nextInt();
		int[] numbers = new int[numOfNum];
		
		for(int i = 0; i < numOfNum; i++) {
			System.out.print("Next #: ");
			numbers[i] = scanner.nextInt();
			average = average + numbers[i];
		}
		
		average = average/numOfNum ;
		
		System.out.println("Average = " + average);
		
	}
	
//Q2). Java Program to calculate factorial using iterative method.
	public static int factorialIter(int i) {
		int fact = 1;
		
		for(int j=1; j <= i; j++) {
			fact = fact * j;	
		}

		return fact;
	}
	
//Q3). Java Program to calculate factorial using recursion.
	public static int factorial(int i) {
		
		if(i == 0) {
			return 1;
		} else {
			return i * factorial(i-1);
		}
	}
	
	
//Q4). Java Program to check a given number is even or odd.
	public static void evenOrOdd(int i) {
		if(i%2 == 0) {
			System.out.println("Number is Even");
		} else {
			System.out.println("Number is Odd");
		}
	}
	
//Q5). Java program to print first n Prime Number with explanation.
	public static boolean prime(int num) {
		if(num == 1) {
			return false;
		}
		if(num == 2 || num == 3) {
			return true;
		}
		for(int i = 2; i <= num/2; i++) {
			if(num%i == 0) {
				return false;
			}
		}
		return true;
		
	}
	
//Q6). Java Program to print Prime Number in a given range
	public static ArrayList<Integer> primeInRange(int start, int end) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		
		for(int i = start; i <= end; i++) {
			if(prime(i)) {
				primes.add(i);
			}
		}
		return primes;
	}
	
//Q7). Java Program to find Smallest number among three.
	public static int largestOfThree(int[] arr) {
		int largest = arr[0];
		 for(int i = 1; i < arr.length; i++) {
			 if(largest < arr[i]) {
				 largest = arr[i];
			 }
		 }
		return largest;
	}
	
//Q8). Java program to calculate the power using the POW method.
//Q9). Java Program to calculate the power without using POW function.
//Q10). Java Program to calculate the square of a given number.
	public static int perfectSquare(int num) {
		int square = 0;
		for(int i = 0; i < num /2; i++) {
			if(i*i == num) {
				square = i;
			}
		}
		return square;
	}

}
