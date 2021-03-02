
// javac -cp unit1/ScrollTextArea.java
// java -cp unit1 ScrollTextArea

// Eclipse 2020-12 (4.18.0)

// https://stackoverflow.com/questions/19212126/how-can-we-add-jscrollpane-on-jtextarea-in-java

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/** @see https://stackoverflow.com/a/19215436/230513 */
public class ScrollTextArea extends JFrame {

	// example 1 - 
    public ScrollTextArea() {
        super("Text Area");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextField tf = new JTextField(12);
        add(tf, BorderLayout.NORTH);
        JTextArea ta = new JTextArea(24, 12);
        JScrollPane jp = new JScrollPane(ta);
        add(jp, BorderLayout.CENTER);
        pack();
        // arbitrary size to make vertical scrollbar appear
        setSize(240, 240);
        setLocationByPlatform(true);
        setVisible(true);
        ta.append("hello");
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ScrollTextArea();
            }
        });
        
        // example 2
        /** @see https://stackoverflow.com/questions/8849063/adding-a-scrollable-jtextarea-java */
        JFrame frame = new JFrame ("Test");
        JTextArea textArea = new JTextArea ("Test");
        
        JScrollPane scroll = new JScrollPane (textArea, 
           JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        
        frame.add(scroll);
        frame.setVisible (true);
        textArea.append("\n a \n a \n a \n a \n a \n a \n a \n a \n a \n a \n a \n a \n a \n a \n a \n a \n a \n a \n a \n a \n a \n a \n a \n a ");
        
    }
}

/*
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ScrollTextArea() extends JFrame
{
   super("Text Area");
   tf=new JTextField();
   tf.setBounds(100,350,300,30);
   add(tf);
   ta=new JTextArea();
   jp= new JScrollPane(ta);
   jp.setBounds(5, 5, 100, 100);
   add(jp);
   setLayout(null);
   setSize(500,500);
   setVisible(true);
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
*/

//import java.awt.BorderLayout;
//import java.awt.EventQueue;
//
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.border.EmptyBorder;
//
//public class ScrollTextArea extends JFrame {
//
//	private JPanel contentPane;
//
//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					ScrollTextArea frame = new ScrollTextArea();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
//
//	/**
//	 * Create the frame.
//	 */
//	public ScrollTextArea() {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 450, 300);
//		contentPane = new JPanel();
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//		contentPane.setLayout(new BorderLayout(0, 0));
//		setContentPane(contentPane);
//	}
//
//}
