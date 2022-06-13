package com.day011;

public class Test4 {
	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		
		sb.append("서울");
		sb.append("부산");
		System.out.println(sb);
		//클래스의 객체를 출력하는 것
		
		String str = sb.toString();
		System.out.println(str);
		//String의 내용을 출력하는 것		
			
	}

}
//Buffer
//클래스이기 때문에 자료형처럼 쓸 수 없음 반드시 new를 이용해 buffer를 만들어준다.
//처리 작업을 통해 메모리에 남김없이 깔끔하게 연산처리를 하도록 도와준다.
