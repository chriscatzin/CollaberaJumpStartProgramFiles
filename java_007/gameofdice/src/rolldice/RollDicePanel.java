package rolldice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

//////////////////////////////////////////////////////////// class RollDicePanel
public class RollDicePanel extends JPanel {
    //======================================================= instance variables
    private Dice _leftDie;     // component for one die
    private Dice _rightDie;

    //============================================================== constructor
    /** Create border layout panel with one button and two dice. */
    RollDicePanel() {
        //... Create the dice
        _leftDie  = new Dice();
        _rightDie = new Dice();

        //...Create the button to roll the dice
        JButton rollButton = new JButton("Click to Roll Dice!");
        rollButton.setFont(new Font("Sansserif", Font.PLAIN, 24));

        //... Add listener.
        rollButton.addActionListener(new RollListener());

        //... Layout components
        this.setLayout(new BorderLayout(5, 5));
        this.add(rollButton, BorderLayout.NORTH);
        this.add(_leftDie , BorderLayout.WEST);
        this.add(_rightDie, BorderLayout.EAST);

        this.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
    }


    ////////////////////////////////////////// inner listener class RollListener
    private class RollListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            _leftDie.roll();
            _rightDie.roll();
        }
    }
}