package com.cogent.problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SudhirStringDictionary {
	/*
	 * Given a string and a string dictionary, find the longest string in the 
	 * dictionary that can be formed by deleting some character of the given string.
	 * If there are more than one possible result, return the longest word with the 
	 * smallest lexicographical order. If there is no possible result. return the empty
	 * string.
	 * 
	 * ex. 	input: d = {"ale","apple","monkey","plea"}
	 * 		S = "abpcplea"
	 * 		output: "apple"
	 * 		Explanation: After deleting "b", "c" "a" S became "apple" which is present in d.
	 */
	public static void main(String[] args) {
		String[] dictionary = {"ale","apple","monkey","plea"};
		String given = "abpcplea";
		
		System.out.println(stringInDictionary(dictionary,given));
		
	}
	
	public static String stringInDictionary(String[] d, String s) {
		
		//order the list of string largest to smallest
		List<String> ordDict = Arrays.asList(d).stream().sorted((s1,s2) -> s2.length() - s1.length()).collect(Collectors.toList());
		
		for(int i = 0; i < ordDict.size(); i++) {
			
			int dictFound = 0;
			int strIndx = 0;
			
			// from the chosen word find as many letters in order that are in the string
			while(dictFound < ordDict.get(i).length() && dictFound < s.length() && strIndx < s.length()) {
				if(ordDict.get(i).charAt(dictFound) == s.charAt(strIndx)){
					strIndx++;
					dictFound++;
				} else {
					strIndx++;
				}
			}
			
			// if you found the whole word return it else go to the next word
			if(dictFound == ordDict.get(i).length()) {
				return ordDict.get(i);
			}
			
		}
	
		return "";
	}
	
}
