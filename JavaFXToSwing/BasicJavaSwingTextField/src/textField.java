// Java program to create a blank text
// field of definite number of columns.
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class textField extends JFrame implements ActionListener {
    // JTextField
    static JTextField t;

    // JFrame
    static JFrame f;

    // JButton
    static JButton b;

    // label to diaplay text
    static JLabel l;

    // default constructor
    textField()
    {
    }

    // main class
    public static void main(String[] args)
    {
        // create a new frame to store text field and button
        f = new JFrame("TextField using Swing!");

        // create a label to display text
        l = new JLabel("Enter something to build character!");

        // create a new button
        b = new JButton("submit");

        // create a object of the text class
        textField te = new textField();

        // addActionListener to button
        b.addActionListener(te);

        // create a object of JTextField with 16 columns
        t = new JTextField(16);

        // create a panel to add buttons and textfield
        JPanel p = new JPanel();

        // add buttons and textfield to panel
        p.add(t);
        p.add(b);
        p.add(l);

        // add panel to frame
        f.add(p);

        // set the size of frame
        //f.setSize(300, 200);
        f.setBounds(500, 300, 300, 200);

        f.show();
    }

    // if the button is pressed
    public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();
        if (s.equals("submit")) {
            // set the text of the label to the text of the field
            l.setText(t.getText());

            // set the text of field to blank
            t.setText(" ");
        }
    }
}
