package rolldice;

import java.awt.*;
import javax.swing.*;

///////////////////////////////////////////////////////// class RollDice
public class RollDice extends JApplet {

    //=============================================== applet constructor
    /** Applet constructor requires putting the panel in applet.*/
    public RollDice() {
        this.setContentPane(new RollDicePanel());
    }

    //====================================================== method main
    /** Create JFrame and set content pane to a RollDicePanel. */
    public static void main(String[] args) {
        JFrame window = new JFrame("Game of Dice!");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(new RollDicePanel());
        window.pack();
        //System.out.println(window.getContentPane().getSize());
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}