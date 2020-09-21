/**
 *
 * unit 2 examples for computer science, 12 
 * 
 * integer sums - starter GUI project 
 * 
 * to do: CRUD functionality
 *
 *
 * modified     20200921
 * date         20200920
 * @filename	SumElement.java
 * @author      vmso - virtual mr. so
 * @version     1.0
 * @see         assignment 2.2
 */

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SumElement {

	private JFrame frame;
	private JTextField tfOutput;
	private JTextField txtInput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SumElement window = new SumElement();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SumElement() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		tfOutput = new JTextField();
		tfOutput.setEditable(false);
		tfOutput.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
		tfOutput.setBounds(6, 246, 438, 26);
		frame.getContentPane().add(tfOutput);
		tfOutput.setColumns(10);
		
		JTextArea taOutput = new JTextArea();
		taOutput.setEditable(false);
		taOutput.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
		taOutput.setBounds(159, 105, -104, 129);
		frame.getContentPane().add(taOutput);
		
		JLabel lblTitle = new JLabel("Integer Sum");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setForeground(Color.ORANGE);
		lblTitle.setFont(new Font("Helvetica Neue", Font.PLAIN, 28));
		lblTitle.setBounds(6, 6, 438, 40);
		frame.getContentPane().add(lblTitle);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
		btnAdd.setBounds(290, 58, 117, 29);
		frame.getContentPane().add(btnAdd);
		
		JButton btnRemove = new JButton("Remove");
		btnRemove.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
		btnRemove.setBounds(290, 87, 117, 29);
		frame.getContentPane().add(btnRemove);
		
		JButton btnList = new JButton("List");
		btnList.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
		btnList.setBounds(290, 118, 117, 29);
		frame.getContentPane().add(btnList);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
		btnExit.setBounds(290, 146, 117, 29);
		frame.getContentPane().add(btnExit);
		
		JLabel lblInput = new JLabel("Enter an Integer:");
		lblInput.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
		lblInput.setBounds(48, 63, 110, 16);
		frame.getContentPane().add(lblInput);
		
		txtInput = new JTextField();
		txtInput.setBounds(159, 58, 130, 26);
		frame.getContentPane().add(txtInput);
		txtInput.setColumns(10);
		
		JButton btnSumOdd = new JButton("Sum Odd");
		btnSumOdd.setHorizontalAlignment(SwingConstants.LEFT);
		btnSumOdd.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
		btnSumOdd.setBounds(170, 205, 117, 29);
		frame.getContentPane().add(btnSumOdd);
		
		JButton btnSumEven = new JButton("Sum Even");
		btnSumEven.setHorizontalAlignment(SwingConstants.LEFT);
		btnSumEven.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
		btnSumEven.setBounds(169, 181, 117, 29);
		frame.getContentPane().add(btnSumEven);
		
		JButton btnSumAll = new JButton("Sum All");
		btnSumAll.setHorizontalAlignment(SwingConstants.LEFT);
		btnSumAll.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
		btnSumAll.setBounds(170, 146, 117, 29);
		frame.getContentPane().add(btnSumAll);
	}
}
