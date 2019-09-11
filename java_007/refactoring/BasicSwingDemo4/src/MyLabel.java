import javax.swing.*;
public class MyLabel {
    private String position;

    MyLabel() {

    }

    JLabel setLabel(String l, String p, JFrame jf) {
        lambdaLabel rtnLabel = () -> {
            position = p;
            JLabel lb = new JLabel(l);
            setLabelInLayout(jf, lb);
            return lb;
        };
        return rtnLabel.label();
    }

    void setLabelInLayout(JFrame jF, JLabel jl) {
        jl.setHorizontalAlignment(JLabel.CENTER);
        jl.setVerticalAlignment(JLabel.CENTER);
        jF.add(jl, position);
    }
}
