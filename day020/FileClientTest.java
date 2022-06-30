package com.day020;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class FileClientTest {

	public static void main(String[] args) {
		
		int port = 7777;
		String host = "192.168.16.2"; //내 ip주소
		
		Socket sc = null;
		
		ObjectOutputStream oos = null;
		
		Scanner scn = new Scanner(System.in);
		//자기가 가지고 있는 파일의 위치정보 입력
		String path;
		
		try {
			
			System.out.print("전송할 파일 경로및 파일명?");//d:\\doc\\a.txt
			path = scn.next();
			
			File f = new File(path);
			
			if(!f.exists()) {
				System.out.println("파일이 없습니다.");
				System.exit(0);
			}
			
			//파일이 있는경우 - 서버연결
			sc = new Socket(host, port);
			
			oos = new ObjectOutputStream(sc.getOutputStream());
			oos.flush();
			
			//파일 전송시작
			FileInfo info;
			
			info = new FileInfo();
			info.setCode(100);
			info.setData(f.getName().getBytes());
			info.setSize((int)f.length());
			
			oos.writeObject(info);
			System.out.println(f.getName() + "파일 전송 시작!!!");
			
			Thread.sleep(30);
			
			//파일내용전송			
			FileInputStream fis = new FileInputStream(f);
			
			int byteData = 0;
			
			byte[] buffer = new byte[1024];
			
			while((byteData = fis.read(buffer,0,1024))!=-1){
				//파일의 내용을 한번에 못내보내기 때문에 나눠서 내보내야함.
				
				info = new FileInfo();
				
				info.setCode(110);
				info.setSize(byteData);
				info.setData(buffer);
				
				oos.writeObject(info);
				
				System.out.println(byteData + "bytes 전송중!!!");
				
				buffer = new byte[1024];
				
				Thread.sleep(300);
				
			}
			
			fis.close();
			
			//파일전송종료
			info = new FileInfo();
			info.setCode(200);
			info.setData(f.getName().getBytes());
			info.setSize((int)f.length());
			
			oos.writeObject(info);
			System.out.println(f.getName() + "파일 전송 끝!!!");
			
			Thread.sleep(300);
			
			oos.close();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}		
	}

}


//서버에서 뜨는 메시지는 ..으로 표기
//클라이언트에서 뜨는 메시지는 !!로 표기
