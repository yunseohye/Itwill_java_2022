package com.day006;

public class Test6_1 {
	public static void main(String[] args) {
		System.out.println("[2차원 배열 - 초기화한 뒤 곱셈]\n");
		
		int i,j;
		
		int[][] a = {{1,2,3},{4,5,6},{7,8,9}}; //2차원 배열 초기화하는 방법
		int[][] b = {{9,8,7},{6,5,4},{3,2,1}};
		int[][] sum = new int[3][3];
		
		for(i=0;i<a.length;i++) {
			for(j=0;j<b.length;j++) {
				sum[i][j] = a[i][j] * b[i][j];
				
				System.out.printf("%4d", sum[i][j]);
			}
			System.out.println();
		}
	}
}
