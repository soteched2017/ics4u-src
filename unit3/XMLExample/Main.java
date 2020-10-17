/**
 * examples for computer science, 12 
 * Toronto, Canada
 *
 * https://github.com/soteched2017/ics4u-src
 * https://repl.it/@soteched2017/ics4u-src#Main.java
 *
 * modified     20201016
 * date         20200915
 * @filename	Main.java
 * @author      unknown and vmso - virtual mr. so
 * @version     1.0
 * @see         3.5 XML example
 */

// package xmlpart2; 
package XMLExample;

import java.io.*;

public class Main {
    
    public static void main(String[] args) {
      
      try {
            String filename = "./unit3/XMLExample/information.xml";
            OutputStream fout= new FileOutputStream(filename);
            OutputStream bout= new BufferedOutputStream(fout);
            OutputStreamWriter out
            = new OutputStreamWriter(bout, "8859_1");

            out.write("<?xml version=\"1.0\" ");            
            out.write("encoding=\"ISO-8859-1\"?>\r\n");
            out.write("<!-- 3.5 XML example created by XMLExample.Main -->\r\n");
            out.write("<class>\r\n");
            out.write("<Student>\r\n");
            out.write("<name> Chris </name>\r\n");
            out.write("<address> 1313 Mockingbird Lane </address>\r\n");
            out.write("<phone> 555-1313 </phone>\r\n");
            out.write("<sex> Female </sex>\r\n");
            out.write("</Student> \r\n");

            out.write("<Student>\r\n");
            out.write("<name> Cody </name>\r\n");
            out.write("<address> 211 Pine Street </address>\r\n");
            out.write("<phone> 555-9089 </phone>\r\n");
            out.write("<sex> Male </sex>\r\n");
            out.write("</Student> \r\n");
            out.write("</class>\r\n");

            out.flush();  // Don't forget to flush!
            out.close();

            System.out.println();
            System.out.println("wrote: " + filename);
            System.out.println();
        }
        catch (UnsupportedEncodingException e) {
            System.out.println(
            "This VM does not support the Latin-1 character set."
            );
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
    }
}