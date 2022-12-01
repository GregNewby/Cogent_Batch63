/**
 * 
 */
package com.cogent.problem;

import java.util.Arrays;

/**
 * @author Greg N.
 * @date :
 * 
 */
public class AmitDay05 {
	public static void main(String[] args) {
		int[][] twod = new int[4][3];
				
		twod[0][0] = 1;
		twod[1][1] = 2;
		twod[2][2] = 3;
		twod[1][2] = 3;
		twod[1][0] = 1;


		AmitDay05.twoDArray(twod);	
		
		System.out.println();
		
		AmitDay05.boundaryElem(twod);	
		
		System.out.println();
		
		int[][] threed = new int[2][2];
		
		threed[0][0] = 3;
		threed[1][1] = 3;
		threed[0][1] = 3;

		AmitDay05.twoDArray(threed);
		
		System.out.println();
		
		int[][] a = AmitDay05.rotateMatrix(twod);
		AmitDay05.twoDArray(a);
//		for(double d : AmitDay05.normalNTrace(threed)) {
//			System.out.println(d);
//		}
		
	}

//   1.WAP to Print a 2D Array
	public static void twoDArray(int[][] twod) {
		
		for(int i = 0; i < twod.length; i++) {
			for(int j = 0; j < twod[i].length; j++) {
				System.out.print(" " + twod[i][j] + " ");
			}
			System.out.println();
		}
	}
	
//   2.WAP to Add Two Matrices
	public static int[][] addMatrices(int[][] m1 ,int[][] m2) {
		int[][] answr = new int[m1.length][m1[0].length];
		
		if(m1.length == m2.length && m1[0].length == m2[0].length ) {
			for(int i = 0; i < m1.length; i++) {
				for(int j = 0; j < m1[i].length; j++) {
					answr[i][j] = m1[i][j] + m2[i][j];
				}
			}
		} else {
			System.out.println("Matrices have different orders cannot be added");
		}
		return answr;
	}
	
//   3.WAP to Sort the 2D Array Across Columns
	public static int[][] sortByColumn(int [][] arr, int col){
		for(int i = 0; i< arr.length; i++) {
			Arrays.sort(arr, (rt,rb) -> Integer.compare(rt[col], rb[col]));
		}
		return arr;
	}
	
//   4.WAP to Check Whether Two Matrices Are Equal or Not
	public static boolean equalMatrices(int[][] m1 ,int[][] m2) {

		if(m1.length == m2.length && m1[0].length == m2[0].length ) {
			for(int i = 0; i < m1.length; i++) {
				for(int j = 0; j < m1[i].length; j++) {
					if(m1[i][j] == m2[i][j]) {
						
					} else {
						return false;
					}
				}
			}
		} else {
			return false;
		}
		return true;
	}
	
//   5.WAP to Find the Transpose
	public static int[][] transposeMatrx(int[][] m1){
		int[][] transpose = new int[m1[0].length][m1.length];
		
		for(int i = 0; i < m1.length; i++) {
			for(int j = 0; j < m1[i].length; j++) {
				transpose[j][i]=m1[i][j];
			}
		
		}
		return transpose;
	}

//   6.WAP to Find the Determinant
	public static int determinant2x2(int [][] m1) {
		int determinant;
		if(m1.length == 2 && m1[0].length == 2) {
			determinant = ( m1[0][0] * m1[1][1] ) - ( m1[1][0] * m1[0][1] );
			
		}else {
			System.out.println("Matrix is not a 2x2 Matrix");
			return 0;
		}
		return determinant;
	}

//   7.WAP to Find the Normal and Trace
	//returns double[normal,trace]
	public static double[] normalNTrace(int[][] m1) {
		double[] normNTrace = new double[2];
		
		//first make sure it is a square matrix
		if(m1.length == m1[0].length) {
			//find normal
			int normal = 0;
			for(int i = 0; i < m1.length; i++) {
				for(int j = 0; j < m1[0].length; j++) {
					normal = (int) Math.pow(m1[i][j] , 2) + normal;
				}
				normNTrace[0] = Math.sqrt(normal);
			}
			
			//find trace
			int trace = 0;
			for(int i = 0; i < m1.length; i++) {
				trace = trace + m1[i][i];
			}
			normNTrace[1] = trace;	
		}else {
			System.out.println("Matrix is not a square Matrix");
		}
		
		return normNTrace;
	}

//   8.WAP to Print Boundary Elements of a Matrix
	public static void boundaryElem(int[][] twod) {
		
		for(int i = 0; i < twod.length; i++) {
			if(i == 0 || i == twod.length-1) {
				for(int j = 0; j < twod[i].length; j++) {
					System.out.print(" " + twod[i][j] + " ");
				}
			} else {
				for(int j = 0; j < twod[i].length; j++) {
					if(j == 0 || j == twod[i].length-1) {
						System.out.print(" " + twod[i][j] + " ");
					} else {
						System.out.print("   ");
					}
				}
			}
			System.out.println();
		}
	}

//   9.WAP to Rotate Matrix Elements
	public static int[][] rotateMatrix(int [][] m1){
		int blc;
		
		for(int i = 0; i < m1.length; i++) {
			AmitDay04.shiftR(m1[i], 1);
			
			if( i == m1.length-1) {
				blc = m1[m1.length-1][0];
				for(int ii = m1.length -1 ; ii >= 0 ; ii--) {
					if(ii != 0) {
						m1[ii][0] = m1[ii-1][0];
					} else {
						m1[0][0] = blc;
					}
				}
			}
		}
		
		return m1;
	}

//   10.WAP to Compute the Sum of Diagonals of a Matrix

//   11.WAP to Interchange Elements of First and Last in a Matrix Across Rows

//   12.WAP to Interchange Elements of First and Last in a Matrix Across Columns


}
