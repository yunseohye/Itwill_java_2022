package com.day006;

import java.util.Random;
import java.util.Scanner;

public class Test_homework {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);	

		String[] str = {"가위","바위","보"};

		Random rd = new Random();

		int com,user;

		com = rd.nextInt(3) + 1;

		System.out.println(str[com-1]);

		do {
			System.out.print("1:가위, 2:바위, 3:보 ?");
			user = sc.nextInt();
		} while (user<1 || user>3);


		System.out.println("사람: " +str[user-1] + ", 컴퓨터: "+str[com-1]);

		String result = "";

		result = "무승부 입니다.";

		if((user==1 && com==3) || (user>com && !(com==1 && user==3)))
			result = "사람이 이겼습니다.";
		if((com==1 && user==3) || (com>user && !(user==1 && com==3)))
			result = "컴퓨터가 이겼습니다.";


	}

}
