package com.homework;

import java.util.Scanner;

public class Health {

	Scanner sc = new Scanner(System.in);
	Consumer[] cs;
	int i;

	private int inwon;

	public void set() {

		do {
			System.out.print("인원 수를 입력하시오."); 
			inwon = sc.nextInt();
		} while(inwon<1||inwon>10);

		cs = new Consumer[inwon];
		
	}
	public void input() {

		for(i = 0; i<inwon; i++) {

			cs[i] = new Consumer();

			System.out.print("이름? ");
			cs[i].name = sc.next();
			System.out.print("키? ");
			cs[i].height = sc.nextDouble();
			System.out.print("몸무게? ");
			cs[i].weight = sc.nextDouble();


		}

	}

	private void result() {
		for(i = 0; i<inwon; i++) {
			cs[i].bmi = cs[i].weight / (cs[i].height*cs[i].height/10000);

			if(cs[i].bmi >= 30)
				cs[i].su = "고도비만입니다.";
			else if(cs[i].bmi >= 25)
				cs[i].su = "비만입니다.";
			else if(cs[i].bmi >= 23)
				cs[i].su = "과체중입니다.";
			else if (cs[i].bmi>=18.5)
				cs[i].su = "정상입니다.";
			else
				cs[i].su = "저체중입니다.";

		}

	}

	public void print() {
		result();
		
		for(int i=0; i<inwon;i++) {
			System.out.printf("%s회원님의 BMI는 %.2g입니다.",cs[i].name,cs[i].bmi);
			System.out.printf("회원님은 %s\n", cs[i].su);
			//System.out.println(cs[i].name + "회원님의 BMI는 "+ cs[i].bmi+su);
		}
	}
}



