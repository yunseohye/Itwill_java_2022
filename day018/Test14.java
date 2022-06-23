package com.day018;



import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Hashtable;
import java.util.Iterator;



public class Test14 {

	public static void main(String[] args) throws Exception {
		
		//역직렬화
		FileInputStream fis = new FileInputStream("c:\\doc\\out5.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Hashtable<String, String> h = 
				(Hashtable<String, String>)ois.readObject();
		//쓰는건 write 읽는건 readObject()
		//object로 업캐스트 됬기 때문에 hashtable로 다운캐스트 한다.
		
		Iterator<String> it = h.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			String value = h.get(key);
			System.out.println(key+":"+value);
		}
		//hash map은 순서대로 출력되지 않음.
	}

}
