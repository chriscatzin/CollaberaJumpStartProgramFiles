package swing;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class Main implements ListSelectionListener {
		JList<String> jlst;
		JLabel jlab;
		JComboBox box;
		// Create an array of names.
		String transport[] = { "train", "car", "airplane"};
		Main() {
			// Create a new JFrame container.
			JFrame jfrm = new JFrame("JList Demo");
			// Specify a flow Layout.
			jfrm.setLayout(new FlowLayout());
			// Give the frame an initial size.
			jfrm.setSize(200, 160);
			// Terminate the program when the user closes the application.
			jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			// Create a JList.
			jlst = new JList<String>(transport);
			// Set the list selection mode to single-selection.
			jlst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			// Add list to a scroll pane.
			box = new JComboBox(transport);
			// Set the preferred size of the scroll pane.
			box.setPreferredSize(new Dimension(120, 30));
			// Make a label that displays the selection.
			jlab = new JLabel("Select transport");
			// Add list selection handler.
			jlst.addListSelectionListener(this);
			// Add the list and label to the content pane.
			jfrm.add(jlab);
			jfrm.add(box);
			// Display the frame.
			jfrm.setVisible(true);
		}
		
		// Handle list selection events.
		public void valueChanged(ListSelectionEvent le) {
			// Get the index of the changed item.
			int idx = jlst.getSelectedIndex();
			// Display selection, if item was selected.
			if(idx != -1) {
				jlab.setText("Current selection: " + transport[idx]);
			} else {
				// Otherwise, reprompt.
				jlab.setText("Please choose a name");
			}
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