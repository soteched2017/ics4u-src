/**
 *
 * unit 2 examples for computer science, 12 
 * 
 * student record - from the netbeans-12 project, added check for empty string, and removed plural(s) 
 * 
 * to do: 
 *         add status information
 *         refresh the list automatically 
 *
 *
 * modified     20200920
 * date         20200920
 * @filename	StudentRecord.java
 * @author      unknown and vmso - virtual mr. so
 * @version     1.0
 * @see         unit 2.2 content
 */


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.*;

public class StudentRecord {

	private JFrame frame;
	private JTextField txtName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentRecord window = new StudentRecord();
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
	public StudentRecord() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		ArrayList <String> names = new ArrayList<String>();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Records");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.ORANGE);
		lblNewLabel.setFont(new Font("Helvetica Neue", Font.PLAIN, 24));
		lblNewLabel.setBounds(6, 6, 438, 30);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
		lblName.setBounds(16, 53, 39, 16);
		frame.getContentPane().add(lblName);
		
		txtName = new JTextField();
		txtName.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
		txtName.setBounds(67, 48, 242, 26);
		frame.getContentPane().add(txtName);
		txtName.setColumns(10);
		
		JTextArea txtOutputArea = new JTextArea();
		txtOutputArea.setEditable(false);
		txtOutputArea.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
		txtOutputArea.setBounds(69, 81, 236, 152);
		frame.getContentPane().add(txtOutputArea);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String status = "";
				String temp;
		        temp = txtName.getText();
		        
		        if(temp.length() > 0) {
		        	names.add(temp);
		        }
		        else {
		        	status = "please enter a name";		        	
		        }
		        
		        System.out.println(status);
	        	txtOutputArea.setText(status);
			}
		});
		btnAdd.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
		btnAdd.setBounds(327, 76, 117, 29);
		frame.getContentPane().add(btnAdd);
		
		JButton btnRemove = new JButton("Remove");
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String temp;
		        temp = txtName.getText();
		        names.remove(temp);
			}
		});
		btnRemove.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
		btnRemove.setBounds(327, 107, 117, 29);
		frame.getContentPane().add(btnRemove);
		
		JButton btnSort = new JButton("Sort");
		btnSort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Collections.sort(names);
			}
		});
		btnSort.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
		btnSort.setBounds(327, 136, 117, 29);
		frame.getContentPane().add(btnSort);
		
		JButton btnList = new JButton("List");
		btnList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a;
		        String temp = "";
		        
		        Iterator stepper = names.iterator();
		        while (stepper.hasNext()) {
		            a = (String)stepper.next();
		            temp = temp + a +"\n";
		        }
		        txtOutputArea.setText(temp);
			}
		});
		btnList.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
		btnList.setBounds(327, 166, 117, 29);
		frame.getContentPane().add(btnList);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
		btnExit.setBounds(327, 196, 117, 29);
		frame.getContentPane().add(btnExit);
	}
}
