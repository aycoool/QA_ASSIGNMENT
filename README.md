# Assignment1
 The task fo this assignment was to develop an application that can accept XML as inputs reads the file and Output the resul or responses in XML format.
 The element of the XML will be read by the developed applcation to perform some validation and returns a response messages. 

# Application Description.
 
 This application was designed in JAVA that uses Java Virual machine ( JVM) for the compilation of codes for the Machine Language. 
 The Developed a plication has the following functional capability:

 a) Authentication of users request
 b) Validation of request order against records in the database 
 c) Generation of XML file ofr response Message.
 

# STEP-BY-STEP OF THE APPLICATION RUN USING THE qa-assignment1.jar

  To execute the developed applcation the below steps needs to be followed:
 	
	a. Download the developed  application into a  folder (Assignment1) in  any directory of the computer i.e  C:\Users\Owner\Desktop\BACK-TO-SCHOOL\QUALITY ASSURANCE\ASSIGNMENT\Assignment1/
	
 	b. Open RUN application( windows + R buttonon) on windows type 'cmd'and press Enter button. The windows commnad prompt will open.
	
	c. Type cd <<pathfile of the downloaded applcation on the system >> e.g  cd  C:\Users\Owner\Desktop\BACK-TO-SCHOOL\QUALITY ASSURANCE\ASSIGNMENT\Assignment1/
	
	d. Ensure the test XML file to use is in the path of the downloaded files. I have a sample XML file "IncomingOrder" as giving in Brightspace that i used for test. 
		
	e.In the Prompt of  step C adbove when you have changed to the directory type : java -jar qa-assignment1.jar ( i.e  C:\Users\Owner\Desktop\BACK-TO-SCHOOL\QUALITY ASSURANCE\ASSIGNMENT\Assignment1> java -jar qa-assignment1.jar ) this will run the Application and ask for the filename of the XML.
	
	
# EMBEDED DETAILS ( MOCKED DATA) 

I have outcoded the following for the validation that would be passed from the XML file.:
Authentication of Dealer:
<dealerid>XXX-1234-ABCD-1234</dealerid>
<dealeraccesskey>kkklas8882kk23nllfjj88290</dealeraccesskey>

Validation of the dealer orders:
<partnumber>1234</partnumber>
<quantity>2</quantity>

The above mentioned if remained same in the XML that will be used for test it generate an XML for a succcessful Response but to perform Negative Test , that entries should be changed, this will generate an XML for a Failed Response message.
