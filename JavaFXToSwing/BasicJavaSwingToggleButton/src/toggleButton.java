import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class toggleButton extends JFrame implements ItemListener {
    public static void main(String[] args) {
        new toggleButton();
    }
    private JToggleButton button;
    toggleButton() {
        setTitle("ToggleButton using Swing!");
        setLayout(new FlowLayout());
        setJToggleButton();
        setAction();
        setBounds(500, 300, 300, 100);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private void setJToggleButton() {
        button = new JToggleButton("ON");
        add(button);
    }
    private void setAction() {
        button.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent eve) {
        if (button.isSelected())
            button.setText("OFF");
        else
            button.setText("ON");
    }
}