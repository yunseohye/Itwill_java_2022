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

public class Test2 {

	public static void main(String[] args) {
		
		try {
			
			DocumentBuilderFactory f = 
					DocumentBuilderFactory.newInstance();
			
			DocumentBuilder parser = f.newDocumentBuilder();
			
			Document xmlDoc = null;
			
			String url = "comment.xml";
			
			if(url.indexOf("https://")!=-1) {
				//저게 있으면 원격에 있는 데이터 주소 없으면 로컬에 있는 데이터

				URL u= new URL(url);
				InputStream is = u.openStream();	
				xmlDoc = parser.parse(is);	//xml이나 html을 읽어내는 작업을 여기서 따와서 파싱~ 이라고 한다.


			}else {	//로컬에 있다면~
				xmlDoc= parser.parse(url);

			} 

			String str = "";
			String out = "";
			
			Element root = xmlDoc.getDocumentElement();
			
			Node total = root.getElementsByTagName("total").item(0);
			str = total.getFirstChild().getNodeValue();
			System.out.println("코멘트 갯수: " + str);
			
			NodeList items = root.getElementsByTagName("comment");
			
			for(int i=0;i<items.getLength();i++) {
				
				Node node = items.item(i);
				NodeList nodeList = node.getChildNodes();
				
				NamedNodeMap map = node.getAttributes();
				out = map.getNamedItem("num").getNodeValue();
				
				for(int j=0;j<nodeList.getLength();j++) {

					Node e = nodeList.item(j);
					
					if(e.getNodeType()==Node.ELEMENT_NODE) {
						
						str = e.getChildNodes().item(0).getNodeValue();
						out += " " + str;
						
					}
					
				}
				
				System.out.println(out);
						
			}
			
			
		} catch (Exception e) {

		}

	}

}
