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
 * @filename	NodeLister.java
 * @author      unknown
 * @version     1.0
 * @see         3.5 content 3/3
 */

import java.io.*;

import nu.xom.*;

public class NodeLister {

  public static void main(String[] args) {
  
    if (args.length == 0) {
      System.out.println("Usage: java nu.xom.samples.NodeLister URL");
      return;
    } 
      
    Builder builder = new Builder();
     
    try {
      Document doc = builder.build(args[0]);
      Element root = doc.getRootElement();
      listChildren(root, 0);      
    }
    // indicates a well-formedness error
    catch (ParsingException ex) { 
      System.out.println(args[0] + " is not well-formed.");
      System.out.println(ex.getMessage());
    }  
    catch (IOException ex) { 
      System.out.println(ex);
    }  
  
  }
  
  public static void listChildren(Node current, int depth) {
   
    printSpaces(depth);
    String data = "";
    if (current instanceof Element) {
        Element temp = (Element) current;
        data = ": " + temp.getQualifiedName();   
    }
    else if (current instanceof ProcessingInstruction) {
        ProcessingInstruction temp = (ProcessingInstruction) current;
        data = ": " + temp.getTarget();   
    }
    else if (current instanceof DocType) {
        DocType temp = (DocType) current;
        data = ": " + temp.getRootElementName();   
    }
    else if (current instanceof Text || current instanceof Comment) {
        String value = current.getValue();
        value = value.replace('\n', ' ').trim();
        if (value.length() <= 20) data = ": " + value;
        else data = ": " + current.getValue().substring(0, 17) + "...";   
    }
    // Attributes are never returned by getChild()
    System.out.println(current.getClass().getName() + data);
    
    for (int i = 0; i < current.getChildCount(); i++) {
      listChildren(current.getChild(i), depth+1);
    }
    
  }
  
  private static void printSpaces(int n) {
    
    for (int i = 0; i < n; i++) {
      System.out.print(' '); 
    }
    
  }

}