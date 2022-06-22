package com.day018;

import java.io.IOException;
import java.io.OutputStream;

//out : 출력 용도의 기본 스트림

public class Test2 {

	public static void main(String[] args) throws IOException {

		OutputStream os = System.out; //콘솔창에 출력할 수 있게 하는 것
		//System.out을 OutputStream으로 감싸준 관계.
		//System.out의 힘이 약할 때 감싸줘 다른 힘을 더 주는 것이다.
		
		byte[] b = new byte[3]; //기본 buffer
		
		b[0] = 65;
		b[1] = 97;
		b[2] = 122;
		
		os.write(b);
		os.close(); 
		//close를 하지 않으면 쓰레기 값이 생성되기 때문에
		//다음번에 사용할 때 막혀서 값이 제대로 출력되지 않기 때문에 사용한다.
		
		System.out.println("나 보이냐?");
	}

}
////buffer : 데이터를 저장하는 공간