/**
 *
 * unit 3 examples for computer science, 12 
 *
 *
 * modified     20201017
 * date         20201011
 * @filename	Main.java
 * @author      unknown and vmso - virtual mr. so
 * @version     1.0
 * @see         3.5 content 2/3
 */

package xmlmodify;

import java.io.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.*;
import org.xml.sax.*;

public class Main {
    
    public static void main(String[] args) {

        try {
            String filepath = "./unit3/XMLModify/build/classes/information.xml";
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(filepath);

            // get the student element by tag name directly
            Node Student = doc.getElementsByTagName("Student").item(0);

            // append a new node to first student
            Element dateOfBirth = doc.createElement("dateofbirth");
            dateOfBirth.appendChild(doc.createTextNode("12/11/1992"));
            Student.appendChild(dateOfBirth);

            // append a new node to second student
            Node Student1 = doc.getElementsByTagName("Student").item(1);
            Element dateOfBirth1 = doc.createElement("dateofbirth");
            dateOfBirth1.appendChild(doc.createTextNode("01/01/1993"));
            Student1.appendChild(dateOfBirth1);

            // change the name of the first student
            Node a = doc.getElementsByTagName("name").item(0);
            a.setTextContent("Susan");

            // write the content into xml file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result =  new StreamResult(new File(filepath));
            transformer.transform(source, result);

            System.out.println("xmlmodify.Main Done");

        } catch(ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch(TransformerException tfe) {
            tfe.printStackTrace();
        } catch(IOException ioe) {
            ioe.printStackTrace();
        } catch(SAXException sae) {
            sae.printStackTrace();
        }
    }
}


