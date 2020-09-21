/**
 * this program demonstrates the use of graphics
 * also, see the NetBeams version NetBeansJFrameForm
 * 
 * modified     20200919
 * date         20200705
 * @filename	GuiCoded.java
 * @author      unknown and vmso - virtual mr. so
 * @version     1.0
 * @see         unit 1 content
 */

package unit1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiCoded extends JFrame{
    
    public GuiCoded () {

        super ("manually coded GUI"); // https://chortle.ccsu.edu/java5/index.html#56
        
        setDefaultLookAndFeelDecorated(true);        
        // getContentPane().setLayout(new FlowLayout());
        setLayout(null);        
        
        JLabel pageLabel = new JLabel("enter some number");
        JTextField input = new JTextField("input");
        JButton btn = new JButton("Submit");
        JTextArea output = new JTextArea("output");
        
        pageLabel.setBounds(10, 25, 200, 25);      
        add(pageLabel);
        
        input.setBounds(10, 50, 100, 25);
        add(input);
        
        btn.setBounds(10, 100, 100, 25);
        add(btn);
        
        output.setBounds(10, 150, 300, 100);
        add(output);        
        
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {         
                try {
                    Float f = new Float(input.getText());
                    String result = "\nMath.sqrt: " + Math.sqrt(f);
                    result += "\nMath.round: " + Math.round(f);
                    result += "\nMath.pow: " + Math.pow(f,2);   
                    output.setText(result);
                }
                catch(Exception ex)
                {
                    output.setText("an exception occurred");
                }
            }
        });
        
        setSize(300,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        
        

    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("NetBeansJFrameForm main()");
        GuiCoded cg = new GuiCoded();
    }
}