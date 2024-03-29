package swing;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

class Main implements ItemListener { 

	// global to the class
	JLabel jlabSelected;
	JLabel jlabChanged;
	JLabel select;
	JCheckBox jcbWeb;
	JCheckBox jcbDesktop;
	JCheckBox jcbMobile;
	JLabel response;
	JLabel allTargets;
	String noneStr = "<none>";

	Main() {
		// Create a new JFrame container.
		JFrame jfrm = new JFrame("Demonstrate Check Boxes");
		// Specify FlowLayout for the layout manager.
		jfrm.setLayout(new FlowLayout());
		// Give the frame an initial size.
		jfrm.setSize(280, 120);
		// Terminate the program when the user closes the application.
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Create empty labels.
		select = new JLabel("Select App Deployment Options");
		jlabSelected = new JLabel("");
		jlabChanged = new JLabel("");
		// Make check boxes.
		jcbWeb = new JCheckBox("Web");
		jcbDesktop = new JCheckBox("Desktop");
		jcbMobile = new JCheckBox("Mobile");
		// Events generated by the check boxes
		// are handled in common by the itemStateChanged()
		// method implemented by CBDemo.
		jcbWeb.addItemListener(this);
		jcbDesktop.addItemListener(this);
		jcbMobile.addItemListener(this);
		// Add check boxes and labels to the content pane.
		jfrm.add(select);
		jfrm.add(jcbWeb);
		jfrm.add(jcbDesktop);
		jfrm.add(jcbMobile);
		jfrm.add(jlabChanged);
		jfrm.add(jlabSelected);
		// Display the frame.
		jfrm.setVisible(true);
	}

	@Override
	public void itemStateChanged(ItemEvent ie) {
		String str = "";
		// Obtain a reference to the check box that
		// caused the event.
		JCheckBox cb = (JCheckBox) ie.getItem();
		// Report what check box changed.
		if(cb.isSelected()) {
			jlabChanged.setText(cb.getText() + " was just selected.");
		} else {
			jlabChanged.setText(cb.getText() + " was just cleared.");
		}
		// Report all selected boxes.
		if(jcbWeb.isSelected()) {
			str += "Web ";
		}
		if(jcbDesktop.isSelected()) {
			str += "Desktop ";
		}
		if(jcbMobile.isSelected()) {
			str += "Mobile ";
		}
		jlabSelected.setText("Selected check boxes: " + str);
	}
	public static void main(String args[]) {
		// Create the frame on the event dispatching thread.
			SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					new Main();
				}
			});
	}
}
