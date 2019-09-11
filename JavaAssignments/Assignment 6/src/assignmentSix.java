import javax.swing.*;
import java.awt.*;

public class assignmentSix {

    public static void main(String[] args) {
        // JFrame will organize all the data into a table.
        // I ended up setting the JFrame name to Dice Combination
        // Label Matrix
        JFrame f = new JFrame("Dice Combination Label Matrix");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container content = f.getContentPane();

        // System.out.println("Dice Combinations Label Matrix");
        Object[][] diceArray = { {"Dice 1", "Snake Eyes", "Australian yo", "Little Joe From Kokomo",
                "No field five", "Easy Six","Six one you're done"},
                {"Dice 2", "Ace caught a deuce", "Ballerina", "The fever", "Jimmie Hicks",
                "Benny Blue", "Easy eight"},
                {"Dice 3", "Easy four", "OJ", "Brooklyn Forest", "Big Red", "Eighter from Decatur",
                "Nina from Pasadena"}, {"Dice 4", "Little Phoebe", "Easy Six", "Skinny McKinney",
                "Square pair", "Railroad nine", "Big one on the end"},
                {"Dice 5", "Sixie from Dixie", "Skinny Dugan", "Easy eight", "Jesse James",
                "Puppy paws", "Yo"}, {"Dice 6", "The Devil", "Easy eight", "Lou Brown",
                "Tennessee", "Six five no jive", "midnight"} };

        // This will declare the name of the columns and place each array in the right place.
        Object columns[] = { " ", "Dice 1", "Dice 2", "Dice 3", "Dice 4", "Dice 5", "Dice 6" };

        // This will actually create the table, getting the array from
        // diceArray and into the correct column name.
        JTable table = new JTable(diceArray, columns);
        JScrollPane scrollPane = new JScrollPane(table);
        content.add(scrollPane, BorderLayout.CENTER);
        f.setSize(830, 170);
        f.setVisible(true);

        /* This is the code I used before, but I was having trouble trying to
           format the array into the right place.



        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                JTable table = new JTable(diceArray[i][j]);
                System.out.format( "%-24s" + diceArray[i][j]);
            }

            System.out.println();
        }

         */

    }
}
