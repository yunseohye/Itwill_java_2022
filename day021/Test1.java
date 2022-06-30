package com.day021;

import java.io.InputStream;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Test1 {

	public static void main(String[] args) {

		try {
		
			//DOM객체 생성을 위한 팩토리 생성
			DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
			DocumentBuilder parser = f.newDocumentBuilder();
			// xml을 담는 전용 용기
			
			//입력받은 파일을 parsing하도록 요청하는 클래스
			//xml을 읽어와서 사용자가 원하는 모양으로 보기좋게 정리하는 것
			Document xmlDoc = null;
			
			String url = "book.xml";
			
			if(url.indexOf("https://")!=-1) {
				
				URL u = new URL(url);
				InputStream is = u.openStream();
				xmlDoc = parser.parse(is); //xml파일을 읽어내는 작업을 파싱이라함
				
			} else {
				xmlDoc = parser.parse(url);
			}
	
			//Element : XML문서의 요소를 표현하기 위해 사용
			Element root = xmlDoc.getDocumentElement();
			System.out.println(root.getTagName());
			
			//첫번째 book
			//Node : 각 요소를 읽고 쓰기위해 사용
			Node book1 = root.getElementsByTagName("book").item(0);
			System.out.println(((Element)book1).getAttribute("kind"));
			//((Element)book1) : DOWNCAST
			
			Node title = book1.getFirstChild(); //첫번째 자식노드
			Node title1 = title.getNextSibling();
			System.out.println(title1.getNodeName()); //노드의 이름
			Node title2 = title1.getFirstChild();
			System.out.println(title2.getNodeValue()); //노드의 값
			
			String out = "";
			String str = "";
			
			NodeList books = root.getElementsByTagName("book");
			
			for(int i=0;i<books.getLength();i++) {
				
				Node book = books.item(i);
				str = book.getNodeName();
				
				out += "노드명: " + str;
				
				NamedNodeMap bookMap = book.getAttributes();
				str = bookMap.getNamedItem("kind").getNodeValue();
				
				out += ", kind: " + str;
				
				NodeList elementList = book.getChildNodes();
				
				for(int j=0;j<elementList.getLength();j++) {
					
					Node e = elementList.item(j);
					
					str = "";
					
					if(e.getNodeType()==Node.ELEMENT_NODE) {
						//Node.ELEMENT_NODE가 맞는지 검증하는 작업.
						str = ", " + e.getNodeName();
						out += str + ":";
						out += e.getChildNodes().item(0).getNodeValue();
					}
				}
				
				out += "\n";
			}
			
			System.out.println(out);
			
		} catch (Exception e) {

		
		}
		
		
	}

}
