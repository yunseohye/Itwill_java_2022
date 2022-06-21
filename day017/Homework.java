package com.day017;

import java.util.Random;
import java.util.Scanner;

class Thread10 implements Runnable {

	@Override
	public void run() {
		
		System.out.print("고민중...");
		
		for(int i=1;i<=4;i++) {
			System.out.print("...");
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace(); 
			}
		} 
		
	}
	
}

public class Homework {
	
	private static String[] name = 
		{"오세라","안수언","엄희성","김성현","윤다영",
		"김희진","이동우","최재혁","김홍수","서수현",
		"윤재일","정영진","박선미","전은지","류창주",
		"김수지","이은지","박수정","정성경","심민정",
		"윤채련","김영운","안시연","이정민","박수진",
		"윤서혜","정민정"};
	
	private static int saram = name.length;
	
	public Homework(int saram, String[] name) {
		this.saram = saram;
		this.name = name;
	}
		
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int saram;
		
		System.out.print("발표자 인원 수?");
		saram = sc.nextInt();
		
		Thread t1 = new Thread(new Thread10());
		t1.start();
	
		try {
			t1.join();
		} catch (Exception e) {

		}
	
		System.out.println("\n\n축하합니다!!! 발표자입니다!!\n");
		
		Random rd = new Random();
		
		for(int i=0;i<saram;i++) {
			
			int j = rd.nextInt(saram)+1; 
			
			System.out.println((i+1)+"번째 발표자 : "+name[j]);			
		}
		
		
	}
}
