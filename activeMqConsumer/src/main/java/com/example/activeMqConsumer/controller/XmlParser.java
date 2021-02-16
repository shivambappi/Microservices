package com.example.activeMqConsumer.controller;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import java.util.*;

public class XmlParser {

	public void parsexml(String messageData) {
	
		
	}

	
	public static void main(String args[]) throws SAXException, IOException
	{
		File file  = new File("C:\\Users\\dell\\Desktop\\emp.xml");
		
		
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();  
		DocumentBuilder db;
		try {
			db = dbf.newDocumentBuilder();
			Document doc = db.parse(file);  
			doc.getDocumentElement().normalize();  
			System.out.println("Root element: " + doc.getDocumentElement().getNodeName()); 
			NodeList nodeList = doc.getElementsByTagName("CD"); 
			System.out.println("NodeList length is "+ nodeList.getLength());
			
			List<Cd> cds = new ArrayList<Cd>();
					
			
			for (int itr = 0; itr < nodeList.getLength(); itr++)   
			{
				
				Node node = nodeList.item(itr); 
				System.out.println(node);
				
				System.out.println("NOde Name is" +node.getNodeName());
			
				//System.out.println(node.getNodeType());
				//System.out.println(Node.ELEMENT_NODE);
				
				Element eElement = (Element) node;  
				System.out.println("TITLE: "+ eElement.getElementsByTagName("TITLE").item(0).getTextContent());  
				System.out.println("ARTIST: "+ eElement.getElementsByTagName("ARTIST").item(0).getTextContent());  
				System.out.println("COUNTRY: "+ eElement.getElementsByTagName("COUNTRY").item(0).getTextContent());  
				System.out.println("COMPANY: "+ eElement.getElementsByTagName("COMPANY").item(0).getTextContent());  
				System.out.println("PRICE: "+ eElement.getElementsByTagName("PRICE").item(0).getTextContent());
				System.out.println("YEAR: "+ eElement.getElementsByTagName("YEAR").item(0).getTextContent());
				
				Cd cd = new Cd();
				cd.setTitle(eElement.getElementsByTagName("TITLE").item(0).getTextContent());
				cd.setCompany(eElement.getElementsByTagName("COMPANY").item(0).getTextContent());
				cd.setCountry(eElement.getElementsByTagName("COUNTRY").item(0).getTextContent());
				cd.setPrice(Double.valueOf(eElement.getElementsByTagName("PRICE").item(0).getTextContent()));
				cd.setYear(Integer.valueOf(eElement.getElementsByTagName("YEAR").item(0).getTextContent()));
				cd.setArtist(eElement.getElementsByTagName("ARTIST").item(0).getTextContent());
				cds.add(cd);
				
			}

			callScheduler(cds);
			
			
			
			
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		
	}


	private static void callScheduler(List<Cd> cds) {
            
		System.out.println(cds);
		
	}
	
	
}
