import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class JScrollPaneToTopAction implements ActionListener {
    JScrollPane scrollPane;
    public JScrollPaneToTopAction(JScrollPane scrollPane) {
        if (scrollPane == null) {
            throw new IllegalArgumentException(
                    "JScrollPaneToTopAction: null JScrollPane");
        }
        this.scrollPane = scrollPane;
    }
    public void actionPerformed(ActionEvent actionEvent) {
        JScrollBar verticalScrollBar = scrollPane.getVerticalScrollBar();
        JScrollBar horizontalScrollBar = scrollPane.getHorizontalScrollBar();
        verticalScrollBar.setValue(verticalScrollBar.getMinimum());
        horizontalScrollBar.setValue(horizontalScrollBar.getMinimum());
    }
}


public class scrollPane {

    public static void main(String args[]) {
        JFrame frame = new JFrame("Scroll Pane using Swing!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("This is an example using a ScrollPane in Java using Swing! Also, this builds character!");
        label.setPreferredSize(new Dimension(1000, 100));
        JScrollPane jScrollPane = new JScrollPane(label);

        JButton bn = new JButton("Reset");

        bn.addActionListener(new JScrollPaneToTopAction(jScrollPane));

        frame.add(bn, BorderLayout.SOUTH);
        frame.add(jScrollPane, BorderLayout.CENTER);
        frame.setSize(400, 150);
        frame.setVisible(true);
    }
}