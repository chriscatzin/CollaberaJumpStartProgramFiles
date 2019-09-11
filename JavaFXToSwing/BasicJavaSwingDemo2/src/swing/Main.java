package swing;

//A JavaFX application with a label

import javax.swing.*;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
	public static void addComponentsToPane(Container pane) {
		pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
		JLabel myLabel = new JLabel("");
	    JButton btn = new JButton();
	    btn.setText("Say 'Hello World'");
	    JButton btn2 = new JButton();
	    btn2.setText("Reset");
	    btn.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	         	myLabel.setText("Hello world!");            	
	         }
	     });

	     btn2.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	         	myLabel.setText("");
	         }
	     });
	     pane.add(btn);
	     pane.add(myLabel);
	     pane.add(btn2);

	}
	
 public static void createAndShowGUI() {
	JFrame frame = new JFrame("HelloWorldSwing");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	addComponentsToPane(frame.getContentPane());
   //Display the window.
     frame.pack();
     frame.setVisible(true);	
 }
 
 public static void main(String[] args) {
	 SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});;
 	}
}