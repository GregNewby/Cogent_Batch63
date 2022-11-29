/**
 * 
 */
package com.cogent.problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * @author Greg N.
 * @date :
 * 
 */
public class AmitDay04 {
	public static void main(String[] args) {
		
	}
	
//    1WAP to Search an Element in an Array
	public static int findInArray(int[] arr, int element) {
		
		for(int i=0; i < arr.length; i++) {
			if(element == arr[i]) {
				return i;
			}
		}
		return -1;
	}
	
//    2WAP to Find the Largest Element in an Array
	public static int largestInArray(int[] arr) {
		AmitDay04.sortArray(arr);
		
		return arr[arr.length-1];
	}

//    3WAP to Sort an Array
	public static int[] sortArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = i +1; j < arr.length; j++) {
				int temp = 0;
				if(arr[j]<arr[i]) {	// swap
					temp = arr[j];
					arr[j]=arr[i];
					arr[i]= temp;
				}
			}
		}
		return arr;
	}
//    4WAP to Sort the Elements of an Array in Descending 
	public static int[] DescArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = i +1; j < arr.length; j++) {
				int temp = 0;
				if(arr[j]>arr[i]) {	// swap
					temp = arr[j];
					arr[j]=arr[i];
					arr[i]= temp;
				}
			}
		}
		return arr;
	}
//    5WAP to Sort the Elements of an Array in Ascending Order
	public static int[] sortA(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = i +1; j < arr.length; j++) {
				int temp = 0;
				if(arr[j]<arr[i]) {	// swap
					temp = arr[j];
					arr[j]=arr[i];
					arr[i]= temp;
				}
			}
		}
		return arr;
	}
//    6WAP to Remove Duplicate Elements From an Array
	public static int[] removeDupl(int[] arr) {
		AmitDay04.sortA(arr);
		int[] temp = new int[arr.length];
		int j = 0 ;
		
		for(int i = 0; i < arr.length - 1; i++) {
	
			if(arr[i] != arr[i +1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++]= arr[arr.length-1];
		
		arr = new int[j];
		for(int i= 0; i < j; i++) {
			arr[i]= temp[i];
		}
		
		return arr;
	}
//    7WAP to Merge Two Arrays
	public static int[] merge2Arry(int[] arr1, int[] newArr1) {
		int[] merged = new int[arr1.length + newArr1.length];
		
		for(int i = 0; i < arr1.length; i++) {
			merged[i]= arr1[i];
		}
		for(int j = 0; j < newArr1.length; j++) {
			merged[arr1.length+j]= newArr1[j];
			
		}
		
		
		
		return merged;
	}
	
//    8WAP to Check if Two Arrays Are Equal or Not
//    9WAP to Remove All Occurrences of an Element in an Array
//    10WAP to Find Common Array Elements
	
//    11WAP to Copy All the Elements of One Array to Another Array
	public static int[] copy(int[] arr1, int[] newArr1) {
		int[] merged = new int[arr1.length + newArr1.length];
		
		for(int i = 0; i < arr1.length; i++) {
			merged[i]= arr1[i];
		}
		for(int j = 0; j < newArr1.length; j++) {
			merged[arr1.length+j]= newArr1[j];
			
		}
		
		
		
		return merged;
	}
	
	
//    12WAP For Array Rotation
	public static int[] shiftR(int[] arr, int places) {
		
		for(int i = 0; i< places; i++) {
			int temp = arr[arr.length-1];
			for(int j = arr.length -1 ; j> 0; j--) {
				arr[j] = arr[j-1];
			}
			arr[0] = temp;
		}
		return arr;
	}
	

}
