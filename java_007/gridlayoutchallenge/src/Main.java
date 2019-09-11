import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Main{

    private int rows = 2;
    private int columns = 2;
    //private Icon res = (UIManager.getIcon("OptionPane.errorIcon"));
    JLabel label1, label2, label3, label4, label5, label6;
    JLabel mainLabel;
    JFrame frame;

    public Main() {
        JPanel panel = new JPanel(new GridLayout(columns, rows));
        //panel.setLayout(new BorderLayout());

        // Create the label's for each button when selected.
        mainLabel = new JLabel("No seat selected");

        label1 = new JLabel("You selected A-1 ");
        label2 = new JLabel("You selected A-2 ");
        label3 = new JLabel("You selected A-3 ");
        label4 = new JLabel("You selected B-1 ");
        label5 = new JLabel("You selected B-2 ");
        label6 = new JLabel("You Selected B-3 ");

        // Make all the label's invisible, besides the main Label.
        mainLabel.setVisible(true);
        label1.setVisible(false);
        label2.setVisible(false);
        label3.setVisible(false);
        label4.setVisible(false);
        label5.setVisible(false);
        label6.setVisible(false);


        // Begin to add the label's to the panel.
        panel.add(mainLabel);
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        panel.add(label4);
        panel.add(label5);
        panel.add(label6);

        // Begin to add the buttons to the panel
        JButton button1 = new JButton("A-1");
        JButton button2 = new JButton("A-2");
        JButton button3 = new JButton("A-3");
        JButton button4 = new JButton("B-1");
        JButton button5 = new JButton("B-2");
        JButton button6 = new JButton("B-3");

        button1.addActionListener(e -> {
            if (!label1.isVisible()) {
                mainLabel.setVisible(false);
                label1.setVisible(true);
                label2.setVisible(false);
                label3.setVisible(false);
                label4.setVisible(false);
                label5.setVisible(false);
                label6.setVisible(false);
            }

        });
        panel.add(button1);
        button2.addActionListener(e -> {
            if (!label2.isVisible()) {
                mainLabel.setVisible(false);
                label1.setVisible(false);
                label2.setVisible(true);
                label3.setVisible(false);
                label4.setVisible(false);
                label5.setVisible(false);
                label6.setVisible(false);
            }

        });
        panel.add(button2);
        button3.addActionListener(e -> {
            if (!label3.isVisible()) {
                mainLabel.setVisible(false);
                label1.setVisible(false);
                label2.setVisible(false);
                label3.setVisible(true);
                label4.setVisible(false);
                label5.setVisible(false);
                label6.setVisible(false);
            }

        });
        panel.add(button3);
        button4.addActionListener(e -> {
            if (!label4.isVisible()) {
                mainLabel.setVisible(false);
                label4.setVisible(true);
                label1.setVisible(false);
                label2.setVisible(false);
                label3.setVisible(false);
                label5.setVisible(false);
                label6.setVisible(false);

            }

        });
        panel.add(button4);

        button5.addActionListener(e -> {
            if (!label5.isVisible()) {
                mainLabel.setVisible(false);
                label5.setVisible(true);
                label1.setVisible(false);
                label2.setVisible(false);
                label3.setVisible(false);
                label4.setVisible(false);
                label6.setVisible(false);
            }

        });
        panel.add(button5);

        button6.addActionListener(e -> {
            if (!label6.isVisible()) {
                mainLabel.setVisible(false);
                label6.setVisible(true);
                label1.setVisible(false);
                label2.setVisible(false);
                label3.setVisible(false);
                label4.setVisible(false);
                label5.setVisible(false);
            }

        });
        panel.add(button6);


        /*
        //for (int row = 0; row < rows; row++) {
            //for (int column = 0; column < columns; column++) {

                JButton button1 = new JButton("A-1");
                button1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(label1.equals(true)) {
                            label1.setVisible(true);
                        }
                    }
                });
                panel.add(button1);

         */
/*
        final JToggleButton button2 = new JToggleButton("A-2");
        button2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if(label2.equals(button2)) {
                    label2.setVisible(true);
                }
            }
        });
        panel.add(button2);

 */

        frame = new JFrame("Basic Matrix Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.pack();
        frame.setLocation(650, 300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(label1)) {
            label1.setVisible(true);
        }

    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                Main theaterJToggle = new Main();
            }
        });
    }
}