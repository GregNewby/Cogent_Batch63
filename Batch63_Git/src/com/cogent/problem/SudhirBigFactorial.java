package com.cogent.problem;

import java.math.BigInteger;

public class SudhirBigFactorial {
	public static void main(String[] args) {
		System.out.print(factorial(214748364));
	}

	public static BigInteger bigFactorial(BigInteger i ) {
		if(!i.equals(new BigInteger("0"))) {
			return i.multiply(i.add(new BigInteger("-1")));
		}
		
		return new BigInteger("1");
	}
	 public static BigInteger factorial(int i) {
		 BigInteger big = new BigInteger(String.valueOf(i));
		 return bigFactorial(big);
	 }
	
}
	
