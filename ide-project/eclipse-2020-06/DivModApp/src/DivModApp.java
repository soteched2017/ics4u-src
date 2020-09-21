/**
 *
 * unit 1.4 examples for computer science, 12 
 * 
 * DivModApp Eclipse 2020.06 project
 *
 *
 * modified     20200919
 * date         20200705
 * @filename	DivModApp.java
 * @author      unknown and vmso - virtual mr. so
 * @version     1.0
 * @see         unit 1.4 content
 */

import java.awt.EventQueue;

import javax.swing.JFrame;
//import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DivModApp {

//	private JFrame frame;
//	private JTextField input1;
//	private JTextField input2;
//	private JTextField output1;
//	private JTextField output2;
//	private JTextField output3;
//	private JTextField output4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		new DivModApp().initialize();
		
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					DivModApp window = new DivModApp();
//					// window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
	}

	/**
	 * Create the application.
	 */
//	public DivModApp() {
//		initialize();
//	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		JFrame frame;
		JTextField txtInput1;
		JTextField txtInput2;
		JTextField txtOutput1;
		JTextField txtOutput2;
		JTextField txtOutput3;
		JTextField txtOutput4;
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JLabel lbl1 = new JLabel("Enter an integer:");
		lbl1.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
		lbl1.setBounds(45, 72, 180, 16);
		frame.getContentPane().add(lbl1);
		
		JLabel lbl2 = new JLabel("Enter another integer:");
		lbl2.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
		lbl2.setBounds(45, 124, 180, 16);
		frame.getContentPane().add(lbl2);
		
		JLabel lblTitle = new JLabel("Two Types of Division");
		lblTitle.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));
		lblTitle.setForeground(Color.MAGENTA);
		lblTitle.setBounds(115, 6, 250, 30);
		frame.getContentPane().add(lblTitle);
		
		txtInput1 = new JTextField();
		txtInput1.setBounds(273, 69, 130, 26);
		frame.getContentPane().add(txtInput1);
		txtInput1.setColumns(10);
		
		txtInput2 = new JTextField();
		txtInput2.setColumns(10);
		txtInput2.setBounds(273, 119, 130, 26);
		frame.getContentPane().add(txtInput2);
		
		// added non-editable txt fields
		txtOutput1 = new JTextField();
		txtOutput1.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
		txtOutput1.setEditable(false);
		txtOutput1.setBounds(45, 188, 231, 26);
		frame.getContentPane().add(txtOutput1);
		txtOutput1.setColumns(10);
		
		txtOutput2 = new JTextField();
		txtOutput2.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
		txtOutput2.setEditable(false);
		txtOutput2.setColumns(10);
		txtOutput2.setBounds(45, 226, 231, 26);
		frame.getContentPane().add(txtOutput2);
		
		txtOutput3 = new JTextField();
		txtOutput3.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
		txtOutput3.setEditable(false);
		txtOutput3.setColumns(10);
		txtOutput3.setBounds(45, 264, 231, 26);
		frame.getContentPane().add(txtOutput3);
		
		txtOutput4 = new JTextField();
		txtOutput4.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
		txtOutput4.setEditable(false);
		txtOutput4.setColumns(10);
		txtOutput4.setBounds(45, 302, 231, 26);
		frame.getContentPane().add(txtOutput4);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
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
		btnCalculate.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
		btnCalculate.setBounds(286, 163, 117, 29);
		frame.getContentPane().add(btnCalculate);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
		btnExit.setBounds(286, 327, 117, 29);
		frame.getContentPane().add(btnExit);
		
		frame.setVisible(true);
		
	}
}
