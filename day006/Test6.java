package com.day006;

public class Test6 {

	public static void main(String[] args) {
		System.out.println("[배열의 배열(2차원 배열)]\n");
		
		int[][] arr = new int[6][6]; //초기값은 다 0이 들어가 있다.
		
		int i,j;
		int n;
		
		n=0;
		for(i=0;i<5;i++) {
			for(j=0;j<5;j++) {
				
				//System.out.println(i+":"+j);
				
				n++;
				arr[i][j] = n;
				
				arr[i][5] += n; //가로의 맨 오른쪽 누적값
				arr[5][j] += n; //세로의 맨 아랫쪽 누적값
				arr[5][5] += n; //맨 오른쪽 아래의 누적값
				
			}
		}

		for(i=0;i<arr.length;i++) {
			for(j=0;j<arr.length;j++) { //가로의 코드
				
				System.out.printf("%4d", arr[i][j]);
				
			}
			System.out.println(); //가로값이 끝나면 줄바꿈을 하여라.
		}
		
		int[][] a = {{1,2,3},{4,5,6},{7,8,9}}; //2차원 배열 초기화하는 방법
		int[][] b = {{9,8,7},{6,5,4},{3,2,1}};
		int[][] sum = new int[3][3];
		
		
	}

}
