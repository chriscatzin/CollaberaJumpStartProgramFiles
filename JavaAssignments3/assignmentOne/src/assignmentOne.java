import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class assignmentOne {
    private static final Scanner scnr = new Scanner(System.in);
    private static String playerName;
    private static String printDataDecision;


    public static void main(String[] args) throws IOException {
        String screenOnly = "screen only";
        String printFile = "print on file";
        String bothPrint = "both";
        System.out.println("Do you want to print on screen only, print on file, or both?");
        printDataDecision = scnr.nextLine();
        // JFrame will organize all the data into a table.
        // I ended up setting the JFrame name to Dice Combination
        // Label Matrix
        if (printDataDecision.equals(screenOnly)) {
            //JFrame f = new JFrame("Dice Combination Label Matrix");
            // f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            // Container content = f.getContentPane();

            // System.out.println("Dice Combinations Label Matrix");
            String[][] diceArray = {{"Dice 1", "Snake Eyes", "Australian yo", "Little Joe From Kokomo",
                    "No field five", "Easy Six", "Six one you're done"},
                    {"Dice 2", "Ace caught a deuce", "Ballerina", "The fever", "Jimmie Hicks",
                            "Benny Blue", "Easy eight"},
                    {"Dice 3", "Easy four", "OJ", "Brooklyn Forest", "Big Red", "Eighter from Decatur",
                            "Nina from Pasadena"}, {"Dice 4", "Little Phoebe", "Easy Six", "Skinny McKinney",
                    "Square pair", "Railroad nine", "Big one on the end"},
                    {"Dice 5", "Sixie from Dixie", "Skinny Dugan", "Easy eight", "Jesse James",
                            "Puppy paws", "Yo"}, {"Dice 6", "The Devil", "Easy eight", "Lou Brown",
                    "Tennessee", "Six five no jive", "midnight"}};

            for (int i = 0; i < diceArray.length; i++) {
                for (int j = 0; j < diceArray.length; j++) {
                    System.out.format("%-20s", diceArray[i][j]);
                }

                System.out.println();
            }

            // This will declare the name of the columns and place each array in the right place.
            //Object columns[] = {" ", "Dice 1", "Dice 2", "Dice 3", "Dice 4", "Dice 5", "Dice 6"};

            // This will actually create the table, getting the array from
            // diceArray and into the correct column name.
            //JTable table = new JTable(diceArray, columns);
            //JScrollPane scrollPane = new JScrollPane(table);
            // content.add(scrollPane, BorderLayout.CENTER);
            //f.setSize(830, 170);
            //f.setVisible(true);
        } else if (printDataDecision.equals(printFile)) {
            FileWriter fileWriter = null;
            BufferedWriter buffer = null;
            try {
                fileWriter = new FileWriter("writeFile.txt");
                buffer = new BufferedWriter(fileWriter);
            } catch (IOException e) {
                e.printStackTrace();
            }

            String[][] diceArray = {{"Dice 1", "Snake Eyes", "Australian yo", "Little Joe From Kokomo",
                    "No field five", "Easy Six", "Six one you're done"},
                    {"Dice 2", "Ace caught a deuce", "Ballerina", "The fever", "Jimmie Hicks",
                            "Benny Blue", "Easy eight"},
                    {"Dice 3", "Easy four", "OJ", "Brooklyn Forest", "Big Red", "Eighter from Decatur",
                            "Nina from Pasadena"}, {"Dice 4", "Little Phoebe", "Easy Six", "Skinny McKinney",
                    "Square pair", "Railroad nine", "Big one on the end"},
                    {"Dice 5", "Sixie from Dixie", "Skinny Dugan", "Easy eight", "Jesse James",
                            "Puppy paws", "Yo"}, {"Dice 6", "The Devil", "Easy eight", "Lou Brown",
                    "Tennessee", "Six five no jive", "midnight"}};

            for (int i = 0; i < diceArray.length; i++) {
                for (int j = 0; j < diceArray.length; j++) {
                    buffer.write(String.format("%-20s", diceArray[i][j]));
                }
                buffer.write("\n");

                //System.out.println();
            }
            buffer.close();


            // This will declare the name of the columns and place each array in the right place.
            //Object columns[] = {" ", "Dice 1", "Dice 2", "Dice 3", "Dice 4", "Dice 5", "Dice 6"};
            //JTable table = new JTable(diceArray, columns);
            //JScrollPane scrollPane = new JScrollPane(table);
            //buffer.write(table);
            //buffer.close();

        } else if (printDataDecision.equals(bothPrint)) {
            FileWriter fileWriter = null;
            BufferedWriter buffer = null;
            try {
                fileWriter = new FileWriter("writeFile.txt");
                buffer = new BufferedWriter(fileWriter);
            } catch (IOException e) {
                e.printStackTrace();
            }

            String[][] diceArray = {{"Dice 1", "Snake Eyes", "Australian yo", "Little Joe From Kokomo",
                    "No field five", "Easy Six", "Six one you're done"},
                    {"Dice 2", "Ace caught a deuce", "Ballerina", "The fever", "Jimmie Hicks",
                            "Benny Blue", "Easy eight"},
                    {"Dice 3", "Easy four", "OJ", "Brooklyn Forest", "Big Red", "Eighter from Decatur",
                            "Nina from Pasadena"}, {"Dice 4", "Little Phoebe", "Easy Six", "Skinny McKinney",
                    "Square pair", "Railroad nine", "Big one on the end"},
                    {"Dice 5", "Sixie from Dixie", "Skinny Dugan", "Easy eight", "Jesse James",
                            "Puppy paws", "Yo"}, {"Dice 6", "The Devil", "Easy eight", "Lou Brown",
                    "Tennessee", "Six five no jive", "midnight"}};

            for (int i = 0; i < diceArray.length; i++) {
                for (int j = 0; j < diceArray.length; j++) {
                    System.out.format("%-20s", diceArray[i][j]);
                    buffer.write(String.format("%-20s", diceArray[i][j]));
                }
                System.out.println();

                //System.out.println();
            }
            buffer.close();


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
}
