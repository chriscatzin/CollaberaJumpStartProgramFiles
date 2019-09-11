package swing;

//A JavaFX application with a label

import javax.swing.*;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
	private static JLabel response;
	
	public static void addComponentsToPane(Container pane) {
		pane.setLayout(new FlowLayout(FlowLayout.CENTER));
		response = new JLabel("Push a Button!");
		JButton btnAlpha = new JButton("Alpha");
		JButton btnBeta = new JButton("Beta");
		btnAlpha.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				response.setText("Alpha was pressed.");
			}
		});
		
		btnBeta.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				response.setText("Beta was pressed.");
			}
		});
	     pane.add(btnAlpha);
	     pane.add(btnBeta);
	     pane.add(response);

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
