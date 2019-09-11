package swing;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
	static JLabel response;
	public static void addComponentsToPane(Container pane) {
		pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
		response = new JLabel("");
		ImageIcon fImage = new ImageIcon("fungi.png");
		Image f = fImage.getImage();
		Image f2 = f.getScaledInstance(50, 50, 0);
		ImageIcon f2Image = new ImageIcon(f2);
		JButton fungi = new JButton("Fungi", f2Image);
		fungi.setPreferredSize(new Dimension(100, 100));
		ImageIcon dImage = new ImageIcon("dairy.png");
		Image d = dImage.getImage();
		Image d2 = d.getScaledInstance(50, 50, 0);
		ImageIcon d2Image = new ImageIcon(d2);
		JButton dairy = new JButton("Dairy", d2Image);
		dairy.setPreferredSize(new Dimension(100, 100));
		dairy.setText("Dairy");
		JButton reset = new JButton();
		reset.setText("Reset");
		fungi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				response.setText("fungi");
			}
		});

		dairy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				response.setText("dairy");
			}
		});

		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				response.setText("");
			}
		});
		pane.add(fungi);
		pane.add(dairy);
		pane.add(response);
	}

	public static void createAndShowGUI() {
		JFrame frame = new JFrame("ButtonImage");
		frame.setLayout(new BorderLayout());
		JLabel toplabel = new JLabel("Push A Button");
		JButton resetButton = new JButton();
		resetButton.setText("Reset");
		resetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				response.setText("");
			}
		});
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(toplabel, BorderLayout.PAGE_START);
		addComponentsToPane(frame.getContentPane());
		//Display the window.
		frame.add(resetButton, BorderLayout.PAGE_END);
		frame.pack();
		frame.setLocationRelativeTo(null);
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