/**
 * 
 */
package com.cogent.problem;

import java.util.HashMap;

/**
 * @author Greg N.
 * @date : 12-5-22
 * 
 */
public class Mock12_05_22 {
	public static void main(String[] args) {
		/*
		 * String oneString = "racecar";
		 * 
		 * System.out.println(madePalindrome(oneString));
		 */
		///////////////////////////////////
		/*
		 * int[] array = {1,3,6,1,3,7,1,7,6};
		 * 
		 * System.out.println(oddOccurance(array));
		 */
		
	}
	public static boolean madePalindrome(String s){
		HashMap ht = new HashMap();
		
		for(int i = 0; i < s.length(); i++) {
			if(ht.containsKey(s.charAt(i))) {
				ht.remove(s.charAt(i));
			} else {
				ht.put(s.charAt(i), 1);
			}
		}
		if(ht.isEmpty() || ht.size()== 1) {
			return true;
		}
		return false;
	}
	
	public static int oddOccurance(int[] arr) {
		HashMap<Integer,Integer> ht = new HashMap<Integer,Integer>();
		
		for(int i : arr) {
			if(ht.containsKey(i)) {
				int oldVal = ht.get(i);
				ht.replace(i, oldVal , oldVal + 1);
			} else {
				ht.put(i, 1);
			}
		}
		
		for(var entry : ht.entrySet()) {
			if(entry.getValue() % 2 != 0) {
				return entry.getKey();
			}
		}
		
		return -100;
	}

}
