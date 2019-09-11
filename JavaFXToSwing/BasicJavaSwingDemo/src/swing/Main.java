package swing;


import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * HelloWorldSwing.java requires no other files. 
 */
import javax.swing.*;        

public class Main {
	
	public static void centerAndSizeJFrameOnScreen(JFrame frm) {
	    /*
			Dimension class is a part of Java AWT. 
	    	It contains the height and width of a 
	    	component in integer as well as double precision. 
	    	The use of Dimension class is that many functions of 
			Java AWT and Swing return dimension object.
	    */
		// get the size of the screen
		// Toolkit class is the abstract superclass of every implementation 
		// in the Abstract Window Toolkit (AWT). 
		// Subclasses of Toolkit are used to bind various components.
		// getDefaultToolkit() returns an instance
		// getScreenSize() is one of the many methods available
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int height = screenSize.height;
		int width = screenSize.width;
		// set the size of the frame to half in width and height
		frm.setSize(width/2, height/2);
		// here's the part where the JFrame gets actually centered
		frm.setLocationRelativeTo(null);
	}
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    public static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("HelloWorldSwing");
        centerAndSizeJFrameOnScreen(frame);
        JPanel panel = new JPanel();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Add the ubiquitous "Hello World" label.
        JButton button = new JButton("Hello World");
        button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Hello world!");
			}
        });
        panel.add(button);
        frame.getContentPane().add(panel);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
    	SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
    }
}