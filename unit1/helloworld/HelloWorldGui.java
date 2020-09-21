/**
*
* hello world gui version
*
* unit 1 examples for computer science, 12 
*
* modified  20200919
* date      20200705
* @filename	HelloWorldGui.java
* @author   unknown and vmso - virtual mr. so
* @version  1.0
* @see      1.3 content and assignment
*/

package unit1.helloworld;

import javax.swing.*;
import java.awt.*;

public class HelloWorldGui extends JFrame {

    public HelloWorldGui () {
        
        super ("Hello World GUI!");
        
        JFrame.setDefaultLookAndFeelDecorated(true);
        setSize(500,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // JLabel changed to JTextArea
        // to do: nvestigate properties of JTextArea
        // i.e. ta should be read-only, not editable
        JTextArea ta = new JTextArea("The Wonderful Thing About Tiggers\nThis is a test\n");        

        FlowLayout flo = new FlowLayout();
        setLayout(flo);
        add(ta);

        setVisible(true);
        
        // System.out.println("hello world");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HelloWorldGui hw = new HelloWorldGui();
    }
}
