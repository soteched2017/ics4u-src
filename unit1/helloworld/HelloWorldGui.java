/**
*
* Hello World GUI version
*
* Unit 1 Examples for Computer Science, 12 
*
* modified 20200806
* date     20200705
* @author  unknown and vmso
* @version 1.0
* @see    Assignment 1.5.2
*/

package helloworld;

import javax.swing.*;
import java.awt.*;

public class HelloWorldGui extends JFrame{
    
    public HelloWorldGui () {

        super ("Hello World!");
        setSize(500,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        JLabel pageLabel = new JLabel("The Wonderful Thing About Tiggers");
        FlowLayout flo = new FlowLayout();
        setLayout(flo);
        add(pageLabel);
        setVisible(true);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HelloWorld hw = new HelloWorld();
    }
}