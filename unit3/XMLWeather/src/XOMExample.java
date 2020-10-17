/**
 *
 * unit 3 examples for computer science, 12 
 * 
 * XOM XML Library example - xom-1.2.6.jar
 * http://www.xom.nu/tutorial.xhtml see exapmle 7
 * http://www.xom.nu
 *
* XML source
 * use the links below for an XML source; the weather underground xml is not 
 * available without an authorization
 *   https://www.learningcontainer.com/wp-content/uploads/2020/03/Sample-employee-XML-file.xml
 * from https://www.learningcontainer.com/sample-xml-file/
 *
 * modified     20201017
 * date         20201011
 * @filename	XOMExample.java
 * @author      unknown and vmso - virtual mr. so
 * @version     1.0
 * @see         3.5 content 3/3
 */

// package xmlweather;

import java.io.*;
import nu.xom.*;

// this is the old demo that doesn't work

public class XOMExample {
    
	int max = 5; 
	int employeeCount = 0;
    String[] employeeName = new String[max];
    String[] employeeTitle = new String[max];
    String[] employeeDiv = new String[max];
    String[] employeeBuid = new String[max];
    String[] employeeRoom = new String[max];
    
    public XOMExample() throws ParsingException, IOException {
        // get the XML document from the web
        Builder builder = new Builder();
        Document doc = builder.build("https://www.learningcontainer.com/wp-content/uploads/2020/03/Sample-employee-XML-file.xml");

        Element root = doc.getRootElement(); // <employees>
        Elements details = root.getChildElements("details");
        
        System.out.println(details.size() + " employees to read");
        for (int current = 0; current < details.size(); current++) {

        	Element detail = details.get(current);

            Element fname = detail.getFirstChildElement("firstname");
            Element lname = detail.getFirstChildElement("lastname");
            employeeName[current] = fname.getValue() + " " + lname.getValue();
            System.out.println(employeeName[current] + " was read");
            
            employeeTitle[current] = detail.getFirstChildElement("title").getValue();
            employeeDiv[current] = detail.getFirstChildElement("division").getValue();
            employeeBuid[current] = detail.getFirstChildElement("building").getValue();
            employeeRoom[current] = detail.getFirstChildElement("room").getValue();
            
        
            try {
            	if(Integer.parseInt(employeeRoom[current]) < 10) {
	                System.out.println(employeeName[current] + " has a basement room: " + employeeRoom[current]);
	                employeeRoom[current] += " basement";
            	}
            } catch (NumberFormatException nfe) {
            	 // do nothing
            }
             
            employeeCount++;
        }
    }

    public void display() {

    	System.out.println("===================================================");
    	
        for (int i=0; i<employeeCount; i++) {
        	System.out.println("name: \t" + employeeName[i]);
        	System.out.println("title: \t" + employeeTitle[i]);
        	System.out.println("division: \t" + employeeDiv[i]);
        	System.out.println("building: \t" + employeeBuid[i]);
        	System.out.println("room: \t" + employeeRoom[i]);
        	System.out.println("===================================================");
        }
    }

    public static void main(String[] args) {
        try {
            XOMExample xexample = new XOMExample();
            xexample.display();
        } catch (Exception exception) {
            System.out.println("Error: " + exception.getMessage());
        }
    }
}


