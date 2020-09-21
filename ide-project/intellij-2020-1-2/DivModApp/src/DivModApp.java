/**
 *
 * unit 1.4 examples for computer science, 12 
 * 
 * DivModApp IntelliJ IDEA (Edu) 2020.1.2 project
 *
 *
 * modified     20200919
 * date         20200705
 * @filename	DivModApp.java
 * @author      unknown and vmso - virtual mr. so
 * @version     1.0
 * @see         unit 1 content
 */


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DivModApp {
    private JTextField txtInput2;
    private JTextField txtInput1;
    private JTextField txtOutput4;
    private JTextField txtOutput2;
    private JTextField txtOutput3;
    private JTextField txtOutput1;
    private JButton btnCalculate;
    private JButton btnExit;
    private JPanel panel;

    public DivModApp() {
        btnCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // added exception handling
                try {
                    String text1,text2;
                    int int1, int2;

                    text1 = txtInput1.getText();
                    text2 = txtInput2.getText();
                    int1 = Integer.parseInt(text1);
                    int2 = Integer.parseInt(text2);

                    txtOutput1.setText(int1 + "/" + int2 + " = " + int1/int2);
                    txtOutput2.setText(int1 + "%" + int2 + " = " + int1%int2);
                    txtOutput3.setText(int2 + "/" + int1 + " = " + int2/int1);
                    txtOutput4.setText(int2 + "%" + int1 + " = " + int2%int1);
                    // note: previously char '=' was used instead of a string "="
                }
                catch (Exception ex) {
                    txtOutput1.setText("an exception occurred");
                    txtOutput2.setText("");
                    txtOutput3.setText("");
                    txtOutput4.setText("");
                }
            }
        });
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main (String[] args) {
        JFrame frame = new JFrame("DivModApp");
        frame.setContentPane(new DivModApp().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,450);
        frame.pack();
        frame.setVisible(true);
    }
}
