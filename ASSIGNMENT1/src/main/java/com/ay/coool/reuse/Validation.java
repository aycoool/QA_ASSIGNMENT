package com.ay.coool.reuse;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

import com.ay.coool.MYSecurity;

public class Validation {


	private static Scanner scan;
	private static Scanner reader;
	/**
	 * This function validates if User's input is integer
	 */
	public static boolean validate_Int(int x, int y){
		scan = new Scanner(System.in);
		boolean finished = false;
		while(!finished){
			while(scan.hasNextInt()){
				x = scan.nextInt();
				y = scan.nextInt();
				if(x < 0 || y < 0){
					System.out.println("Error: Number smaller 0");
				}else{
					System.out.println("Correct");
					finished = true;
				}
			}
		}
		return finished;
	}
	public static boolean is_Integer(Object object) {
		if(object instanceof Integer) {
			return true;
		} else {
			String string = object.toString();
			
			try {
				Integer.parseInt(string);
			} catch(Exception e) {
				return false;
			}	
		}
	  
	    return true;
	}

	public static void validateXML(String xmlFileName) throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory documentBuilderFactory =  DocumentBuilderFactory.newInstance();
			documentBuilderFactory.setValidating(true);
			DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
			documentBuilder.setErrorHandler(new ErrorHandler() {
				
				public void warning(SAXParseException exception) throws SAXException {throw exception;}		
				public void fatalError(SAXParseException exception) throws SAXException {throw exception;}			
				public void error(SAXParseException exception) throws SAXException {throw exception;}
			});
			documentBuilder.parse(new File(xmlFileName));
		}
	
	
	public static String get_File_Path (String fileName){
		String filePath = null;
		if(fileName == null || fileName.trim().isEmpty()){
			System.out.println("Please specify a File path!");
		}else{          
                     filePath = fileName;
		       System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		       System.out.println("File name entered is: "+filePath);
		}    
	    return filePath;
	}
	 public static String get_App_Path() throws UnsupportedEncodingException {
	      java.net.URL url = MYSecurity.class.getProtectionDomain().getCodeSource().getLocation();
	      String jarPath = URLDecoder.decode(url.getFile(), "UTF-8");
	      String parentPath = new File(jarPath).getParentFile().getPath();
	      return parentPath;
	   }
	 
	 public static String get_File_AppPath(){
		return null;
		 
	 }
         	public static String getUserInput(){
		System.out.print("Enter your filename: ");
		Scanner scanner = new Scanner(System.in);
		String userInput = "";
		userInput = scanner.nextLine();
			scanner.close();               
	    return userInput;
	}
}
