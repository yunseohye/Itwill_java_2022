package com.day018;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MyDataMain {

	public static void main(String[] args) throws Exception {

		FileOutputStream fos = new FileOutputStream("c:\\doc\\out6.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		//MyData ob1 = new MyData("배수지",30);
		//oos.writeObject(ob1); 
		//이 형태를 밑에 한줄 코드로 줄여놓은 것임.
		
		oos.writeObject(new MyData("배수지",30));
		oos.writeObject(new MyData("유인나",40));
		oos.writeObject(new MyData("정인선",30));
		oos.writeObject(new MyData("정인아",32));
		
		oos.close();
		fos.close();
	
		//역직렬화 - 직렬화된 데이터를 꺼내는 작업.
		FileInputStream fis = new FileInputStream("c:\\doc\\out6.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		MyData ob = null; //값이 여러개이기 때문에 미리 준비.
		
		try {
		
			while(true) {
				
				ob = (MyData)ois.readObject();
				
				if(ob==null)
					break;
				
				System.out.println(ob.toString());
				/*
				원래는 get, set만들어 그 값을 불러와야하지만 코드가 길어지기 
				때문에 MyData에 toString을 만들어서 그 값을 불러오는 것임
				*/
			}
			
		} catch (Exception e) {

		}
		
		ois.close();
		fis.close();
		
	}

}
