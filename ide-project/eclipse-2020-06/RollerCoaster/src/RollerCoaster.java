/**
 *
 * unit 1 examples for computer science, 12 
 *
 *
 * modified     20200919
 * date         20200705
 * @filename	RollerCoaster.java
 * @author      unknown and vmso - virtual mr. so
 * @version     1.0
 * @see         assignment 1.5.2 content
 */


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RollerCoaster {

//	private JFrame frame;
//	private JTextField textField;
//	private JTextField textField_1;
//	private JTextField textField_2;
//	private JTextField txtOutput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		JTextField txtInput1;
		JTextField txtInput2;
		JTextField txtInput3;
		JTextField txtOutput;
		
		JFrame frame;
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Roller Coaster Ride");
		lblNewLabel.setForeground(Color.MAGENTA);
		lblNewLabel.setFont(new Font("Helvetica Neue", Font.PLAIN, 28));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(6, 6, 438, 34);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblHeight = new JLabel("Height in cm?");
		lblHeight.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
		lblHeight.setBounds(86, 69, 129, 16);
		frame.getContentPane().add(lblHeight);
		
		JLabel lblBack = new JLabel("Back Trouble (Y/N)?");
		lblBack.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
		lblBack.setBounds(86, 97, 129, 16);
		frame.getContentPane().add(lblBack);
		
		JLabel lblHeart = new JLabel("Heart Trouble (Y/N)?");
		lblHeart.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
		lblHeart.setBounds(86, 125, 128, 16);
		frame.getContentPane().add(lblHeart);
		
		txtInput1 = new JTextField();
		txtInput1.setBounds(227, 64, 130, 26);
		frame.getContentPane().add(txtInput1);
		txtInput1.setColumns(10);
		
		txtInput2 = new JTextField();
		txtInput2.setBounds(227, 92, 130, 26);
		frame.getContentPane().add(txtInput2);
		txtInput2.setColumns(10);
		
		txtInput3 = new JTextField();
		txtInput3.setBounds(227, 120, 130, 26);
		frame.getContentPane().add(txtInput3);
		txtInput3.setColumns(10);
		
		txtOutput = new JTextField();
		txtOutput.setEditable(false);
		txtOutput.setBounds(6, 164, 438, 26);
		frame.getContentPane().add(txtOutput);
		txtOutput.setColumns(10);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
		btnCalculate.setBounds(86, 224, 117, 29);
		frame.getContentPane().add(btnCalculate);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
		btnExit.setBounds(240, 224, 117, 29);
		frame.getContentPane().add(btnExit);
		frame.setVisible(true);
		
		
		//		EventQueue.invokeLater(new Runnable() {
		//			public void run() {
		//				try {
		//					RollerCoaster window = new RollerCoaster();
		//					window.frame.setVisible(true);
		//				} catch (Exception e) {
		//					e.printStackTrace();
		//				}
		//			}
		//		});
	}

	//	/**
	//	 * Create the application.
	//	 */
	//	public RollerCoaster() {
	//		initialize();
	//	}
	//
	//	/**
	//	 * Initialize the contents of the frame.
	//	 */
	//	private void initialize() {
	//		
	//	}
}
