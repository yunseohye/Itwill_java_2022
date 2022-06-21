package com.day006;

import java.util.Random;

public class Test2 {

	public static void main(String[] args) {
		System.out.println("[1~45까지의 수 중에서 6개의 난수를 발생시켜\n"
				+ " 크키순으로 정렬하시오.]\n");
		
		//랜덤이라는 클래스에 객체를 생성했다.
		//랜덤에 메로리를 할당 받았다.
		Random rd = new Random();
		
		int[] num = new int[6];
		
		int i,j,temp,n;
		
		n = 0; //배열의 방 번호
		
		while(n<6) {
		
			num[n] = rd.nextInt(45)+1; //0을 제외한 숫자 45개를 출력해준다.
			
			for(i=0;i<n;i++) {
				
				//무작위로 나오는 값 중에 중복값이 나오지 않도록 하는 작업.
				if(num[i]==num[n]) {
					n--;
					break;
				}
				
			}
			
			n++; //자리 유의할 것 맨 위에 위치하면 num[0]값이 출력 X
			
		}
		
		for(i=0;i<num.length-1;i++) {

			for(j=i+1;j<num.length;j++) {

				if(num[i]>num[j]) {

					temp = num[i];
					num[i] = num[j];
					num[j] = temp;

				}

			}

		}
		
		for(int su : num) {
			System.out.printf("%4d", su);
		}
		
	}

}
