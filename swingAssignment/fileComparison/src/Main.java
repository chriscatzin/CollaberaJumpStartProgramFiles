import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;

public class Main implements ActionListener {
    JTextField jtfFirst, jtfSecond;
    JLabel jlabFirst, jlabSecond, jlabResult;
    JButton jbtnComp;
    JCheckBox checkBox;

    Main() {
        JFrame jfrm = new JFrame("Compare Files");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(300, 220);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jtfFirst = new JTextField(25);
        jtfSecond = new JTextField(25);
        jtfFirst.setActionCommand("fileA");
        jtfSecond.setActionCommand("fileB");

        JButton jbtnComp = new JButton("Compare");
        jbtnComp.addActionListener(this);

        jlabFirst = new JLabel("First file: ");
        jlabSecond = new JLabel("Second file: ");
        jlabResult = new JLabel("");

        checkBox = new JCheckBox("Show position of mismatch");

        jfrm.add(jlabFirst);
        jfrm.add(jtfFirst);
        jfrm.add(jlabSecond);
        jfrm.add(jtfSecond);
        jfrm.add(checkBox);
        jfrm.add(jbtnComp);
        jfrm.add(jlabResult);

        jfrm.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        int i, j = 0;

        if (jtfFirst.getText().equals("")) {
            jlabResult.setText("First file name missing.");
            return;
        }
        if (jtfSecond.getText().equals("")) {
            jlabResult.setText("Second file name missing.");
            return;
        }

        try (FileInputStream f1 = new FileInputStream(jtfFirst.getText());
             FileInputStream f2 = new FileInputStream(jtfSecond.getText())) {
            //String count = null;

            int position = 0;

            do {
                i = f1.read();
                j = f2.read();
                position++;
                if (i != j)
                    break;
            } while (i != -1 && j != -1);

            if (i != j)
                if (checkBox.isSelected())
                    jlabResult.setText("Files differ at location " + position);
                else
                    jlabResult.setText("Files are not the same");
            else
                jlabResult.setText("Files compare equal.");
        } catch (IOException e) {
            jlabResult.setText("File Error");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main();
            }
        });
    }
}