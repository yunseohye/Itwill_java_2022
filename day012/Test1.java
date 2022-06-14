package com.day012;

import java.util.Calendar;
import java.util.GregorianCalendar;

//Calendar

public class Test1{

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance(); //class이름.static메소드
		//Calendar now = new GregorianCalendar(); 
		//암시적UPCAST 자식으로 객체를 생성한 후 부모에게 값을 넣어줌
	
		int y = now.get(Calendar.YEAR); //년
		int m = now.get(Calendar.MONTH)+1; 
		//월은 배열처럼 순서를 저장하기 때문에(0~11) month+1해야 원하는 달이 출력됨
		//값을 출력할 때는 month +1, 값을 입력해 저장할 때는 month-1
		int d = now.get(Calendar.DATE);
		int w = now.get(Calendar.DAY_OF_WEEK);
		//한 주의 수가 1~7로 값이 저장이 됨. 일요일 : 1
	
		String[] week = {"일","월","화","수","목","금","토"};
		
		System.out.println(y + "-" + m + "-" + d + "-" + week[w-1]);
		/*
		week[w-1]를 하는 이유 
		-> week배열의 값은 0부터 시작하지만 w는 1부터 시작하기 때문에 
		   -1을 해야해야 원하는 값을 출력받을 수 있다. 
		*/
		
		int startDay = now.getActualMinimum(Calendar.DATE); 
		//사용빈도는 적음 시작일은 무조건 1일이기 때문에 1로 입력하면 끝
		int endDay = now.getActualMaximum(Calendar.DATE);
		
		System.out.println(startDay + "~" + endDay);
		
		System.out.printf("%tF\n",now);
		System.out.printf("%tT\n",now);
	
		System.out.printf("%1$tF %1$tT\n", now);
		//%뒤에 1$를 붙이면 하나의 인수만 입력해도 값이 다 출력이 된다.
		
		now.set(2023, 10-1, 10);
		y = now.get(Calendar.YEAR); 
		m = now.get(Calendar.MONTH)+1; 
		d = now.get(Calendar.DATE);
		w = now.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(y + "-" + m + "-" + d + "-" + week[w-1]);
	}

}

