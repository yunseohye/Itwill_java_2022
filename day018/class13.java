package com.day018;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Hashtable;

import javax.print.DocFlavor.STRING;

//중요해!!!!!!!!!!!!!!
/*
객체의 직렬화(ex. score pakage의 vo)
메모리에 생성된 클래스의 변수의 현재상태를 그대로 보존해서
(메모리에 올라가서 컴퓨터에는 이진수로 저장된 상태 내가 다시 불러오면 
텍스트 버전으로 가져와 올렸던 상태 그대로 사용하도록 해주는것임)
파일에 저장하거나 네트워크를 통해 전달하는 기능이다.
데이터의 종류에 상관없이 영속성을 제공할 수 있다.

직렬화는 implements Serializable를 구현해야 사용이 가능하다.
*/
public class class13 {

	public static void main(String[] args) throws Exception {

		Hashtable<String, String> h = new Hashtable<>();
		
		h.put("1", "배수지");
		h.put("2", "유인나");
		h.put("3", "정인선");
		
		FileOutputStream fos = new FileOutputStream("c:\\doc\\out5.txt"); //직렬화
		ObjectOutputStream oos = new ObjectOutputStream(fos); 
		//file의 데이터가 직렬화 되어있기 때문에 object~로 감싸줌
		
		oos.writeObject(h);
		oos.close();
		fos.close();
		//여기까지만 저장하고 입력하면 바이너리 파일이기 때문에 이진수로 바뀐형태라
		//깨진모습이 나옴. 이런 상태일때 파일내용을 건드리면 파일 내용 전체가 깨진다.
		
		System.out.println("파일 저장 성공!!!");
		
	}

}
