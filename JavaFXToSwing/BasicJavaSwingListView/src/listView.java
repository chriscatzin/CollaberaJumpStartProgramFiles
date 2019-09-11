import javax.swing.*;

public class listView {
    public static void main(String[] args) {
        String subject[] = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday",
                "Sunday "};
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JList<String> list = new JList<String>(subject);
        JScrollPane s = new JScrollPane(list);
        s.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        s.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        f.getRootPane().setWindowDecorationStyle(JRootPane.PLAIN_DIALOG);
        f.add(s);
        f.setSize(200, 100);
        f.setVisible(true);
    }
}