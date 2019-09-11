import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener
{
    JLabel label, tailsLabel;

    public Main( )
    {

        JFrame frame = new JFrame("Head or Tail");
        label = new JLabel("Heads");
        tailsLabel = new JLabel("Tails");
        tailsLabel.setVisible(false);
        label.setVisible(false);
        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(tailsLabel);

        JButton btn = new JButton("Click to flip!");
        JButton reset = new JButton("Reset");
        btn.addActionListener(e -> {
            if (!label.isVisible()) {
                label.setVisible(true);
            }
            else{
                tailsLabel.setVisible(false);
            }
        });

        reset.addActionListener(e -> {
            if(label.isVisible()){
                label.setVisible(false);
            }
        });

        panel.add(btn);
        panel.add(reset);
        frame.add(panel);
        frame.setSize(new Dimension(300, 100));

        frame.setVisible(true);
    }				               // override the abstract method of ActionListener
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Click to flip!")) {
            if(Math.random() == 0.5) {
                label.setVisible(true);
            }
            else{
                tailsLabel.setVisible(true);
            }
        }
        if(e.getActionCommand().equals("Reset")){
            label.setVisible((false));
        }
    }
    public static void main(String args[])
    {
        new Main();
    }
}