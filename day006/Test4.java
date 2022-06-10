package com.day006;


public class Test4 {

	public static void main(String[] args) {
		System.out.println("[Bubble sort]\n");
		
		int [] num = {28,20,15,10,8};
		
		int i,j,temp;
		
		System.out.print("Source Data: ");
		for(int su : num) {
			System.out.printf("%4d", su);
		}
		System.out.println();
		
		//Bubble sort
		for(i=1;i<num.length;i++) {
			for(j=0;j<num.length-i;j++) {
				
				//Bubble sort 값의 순서를 표현하는 공식
				//System.out.println(j + ":" + (j+1));
				
				if(num[j]>num[j+1]) {
					
					temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
					
				}
				
			}
		}
		
		System.out.print("Sorted Data: ");
		for(int su : num) {
			System.out.printf("%4d", su);
		}
		System.out.println();
	}

}
