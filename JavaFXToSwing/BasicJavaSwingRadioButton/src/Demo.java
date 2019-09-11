// Java program to show JRadioButton Example.
// in java. Importing different Package.
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Demo extends JFrame {

    // Declaration of object of JRadioButton class.
    JRadioButton jRadioButton1;

    // Declaration of object of JRadioButton class.
    JRadioButton jRadioButton2;

    // Declaration of object of JButton class.
    JButton jButton;

    // Declaration of object of ButtonGroup class.
    ButtonGroup G1;

    // Declaration of object of JLabel class.
    JLabel L1;

    // Constructor of Demo class.
    public Demo()
    {

        // Setting layout as null of JFrame.
        this.setLayout(null);

        // Initialization of object of "JRadioButton" class.
        jRadioButton1 = new JRadioButton();

        // Initialization of object of "JRadioButton" class.
        jRadioButton2 = new JRadioButton();

        // Initialization of object of "JButton" class.
        jButton = new JButton("Click to Build Character");

        // Initialization of object of "ButtonGroup" class.
        G1 = new ButtonGroup();

        // Initialization of object of " JLabel" class.
        L1 = new JLabel("Choose a OS:");

        // setText(...) function is used to set text of radio button.
        // Setting text of "jRadioButton2".
        jRadioButton1.setText("Windows");

        // Setting text of "jRadioButton4".
        jRadioButton2.setText("Mac");

        // Setting Bounds of "jRadioButton2".
        jRadioButton1.setBounds(120, 30, 120, 50);

        // Setting Bounds of "jRadioButton4".
        jRadioButton2.setBounds(250, 30, 80, 50);

        // Setting Bounds of "jButton".
        jButton.setBounds(105, 90, 200, 30);

        // Setting Bounds of JLabel "L2".
        L1.setBounds(20, 30, 150, 50);

        // "this" keyword in java refers to current object.
        // Adding "jRadioButton2" on JFrame.
        this.add(jRadioButton1);

        // Adding "jRadioButton4" on JFrame.
        this.add(jRadioButton2);

        // Adding "jButton" on JFrame.
        this.add(jButton);

        // Adding JLabel "L2" on JFrame.
        this.add(L1);

        // Adding "jRadioButton1" and "jRadioButton3" in a Button Group "G2".
        G1.add(jRadioButton1);
        G1.add(jRadioButton2);

        // Adding Listener to JButton.
        jButton.addActionListener(new ActionListener() {
            // Anonymous class.

            public void actionPerformed(ActionEvent e)
            {
                // Override Method

                // Declaration of String class Objects.
                String qual = " ";

                // If condition to check if jRadioButton2 is selected.
                if (jRadioButton1.isSelected()) {

                    qual = "Windows";
                }

                else if (jRadioButton2.isSelected()) {

                    qual = "OF COURSE, MAC BOOKS ARE THE BEST!!";
                }
                else {

                    qual = "PLEASE SELECT A BUTTON TO BUILD CHARACTER!";
                }

                // MessageDialog to show information selected radion buttons.
                JOptionPane.showMessageDialog(Demo.this, qual);
            }
        });
    }
}