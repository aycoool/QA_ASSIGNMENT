package com.ay.coool;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.ay.coool.reuse.Validation;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class AppDB extends Validation implements Interface_DB {

	private static Scanner reader;
         public static final String input = getUserInput();


	/**
	 * This function writes a failure message to the xml if the security
	 * authorization fails
	 */
	public static void responseSuccess(int partNum, int quanty) {
		try {
			DocumentBuilderFactory build_doc = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder docBuilder = build_doc.newDocumentBuilder();

			// root elements
			Document doc = docBuilder.newDocument();
			Element itemElement = doc.createElement("item");
			doc.appendChild(itemElement);

			// partNumber elements
			Element partnumber = doc.createElement("partnumber");
			partnumber.appendChild(doc.createTextNode("" + partNum));
			itemElement.appendChild(partnumber);

			// Quantity elements
			Element quantity = doc.createElement("quantity");
			quantity.appendChild(doc.createTextNode("" + quanty));
			itemElement.appendChild(quantity);

			// Result elements
			Element result = doc.createElement("result");
			result.appendChild(doc.createTextNode("Success"));
			itemElement.appendChild(result);

			// write the content into xml file
			TransformerFactory transformerFactory = TransformerFactory
					.newInstance();
			Transformer trans_form = transformerFactory.newTransformer();
			DOMSource doc_source = new DOMSource(doc);
			StreamResult gen_response_output = new StreamResult(new File(get_App_Path()
							+ "\\partnum_Response_SuccessMessage.xml"));
			trans_form.transform(doc_source, gen_response_output);
			System.out.println("File {partnumResponseSuccessMessage.xml} saved to directory ==> "+get_App_Path() +" ");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * This function writes a failure message to the xml if the security
	 * authorization fails
	 */
	public static void ResponseFailure(int fParNtumber, int fQuantity) {
		try {
			DocumentBuilderFactory build_doc = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder docBuilder = build_doc.newDocumentBuilder();

			// root elements
			Document Output_doc = docBuilder.newDocument();
			Element itemElement = Output_doc.createElement("item");
			Output_doc.appendChild(itemElement);

			// partNumber elements
			Element partnumber = Output_doc.createElement("partnumber");
			partnumber.appendChild(Output_doc.createTextNode("" + fParNtumber));
			itemElement.appendChild(partnumber);

			// Quantity elements
			Element quantity = Output_doc.createElement("quantity");
			quantity.appendChild(Output_doc.createTextNode("" + fQuantity));
			itemElement.appendChild(quantity);

			// Result elements
			Element result = Output_doc.createElement("result");
			result.appendChild(Output_doc.createTextNode("failure"));
			itemElement.appendChild(result);

			// Errormsg elements
			Element errorMsg = Output_doc.createElement("errorMessage");
			errorMsg.appendChild(Output_doc.createTextNode("invalid part"));
			itemElement.appendChild(errorMsg);
			// write the content into xml file
			TransformerFactory transformerFactory = TransformerFactory
					.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(Output_doc);
			StreamResult results = new StreamResult(new File(get_App_Path()
							+ "\\partnum_Response_FailureMessage.xml"));
			System.out.println("File {partnumResponseFailureMessage.xml} saved to directory ==> "+get_App_Path() +" ");
			transformer.transform(source, results);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
/**
	public static void main(String[] args) throws ParserConfigurationException,
			SAXException, IOException {
		AppDB obj = new AppDB();
		obj.submitPartnum(123, 2);
	}
        
**/

        
        	public static void main(String[] args) {
		boolean flag = true;
		try {
			String getProgramPath = get_App_Path();
			String fileName = get_File_Path(getProgramPath + "\\" + input);
			validateXML(fileName);
			if (flag) {
				AppDB database = new AppDB();
				MYSecurity security = new MYSecurity();
				boolean validateAccess = security.IsDealerAuthorized(
						"XXX-1234-ABCD-1234", "kkklas8882kk23nllfjj88290");
				if (validateAccess) {
					MYSecurity.successMessage();
					database.submitPartnum(1234, 2);
					System.out.println("Authorized!");
				} else {
					MYSecurity.failureMessage();
					System.out.println("Access Denied!");
				}
			}
		} catch (ParserConfigurationException e) {
			flag = false;
			System.out.println(e.getMessage() + "ParserConfigurationException");
		} catch (FileNotFoundException e) {
			flag = false;
			System.out.println(e.getMessage());
		} catch (SAXException e) {
			flag = false;
			System.out.println(e.getMessage() + "SAXException");
		} catch (IOException e) {
			flag = false;
			System.out.println(e.getMessage());
		}
		System.out.println("xml file is valid: " + flag);
	}
        public void submitPartnum(int partnum, int quantity) {
		int partNo = 0;
		int qty = 0;
		try {
			String fileName = get_File_Path(get_App_Path()+"//"+input);
			DocumentBuilderFactory factory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();

			// Load the input XML document, parse it and return an instance of the Document class.
			Document document = builder.parse(fileName);
			System.out.println("Root element :" + document.getDocumentElement().getNodeName());
                        List<Item> items = new ArrayList<Item>();
			// Get the value of the dealer attribute.
			NodeList nodeList = document.getElementsByTagName("item");
			for (int i = 0; i < nodeList.getLength(); i++) {

				Node node = nodeList.item(i);

				if (node.getNodeType() == Node.ELEMENT_NODE) {
					Element elem = (Element) node;
					partNo = Integer.parseInt(elem
							.getElementsByTagName("partnumber").item(0)
							.getChildNodes().item(0).getNodeValue());
					qty = Integer.parseInt(elem
							.getElementsByTagName("quantity").item(0)
							.getChildNodes().item(0).getNodeValue());
				}
			}

			
			Item Order_object = new Item();
			Order_object.set_Quantity(qty);
			Order_object.set_PartNumber(partNo);
			
		
			if ((partnum == Order_object.get_PartNumber()) && (quantity == Order_object.get_Quantity()) ) {
				responseSuccess(partnum, quantity);
			} else {
				ResponseFailure(partnum, quantity);
			}
                        for (Item item : items) {
				if ((partnum == item.get_PartNumber())
						&& (quantity == item.get_Quantity())) {
					responseSuccess(partnum, quantity);
				} else {
					ResponseFailure(partnum, quantity);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();	
			}	
	}
}
