import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class assignmentTwo {
    private static final Scanner scnr = new Scanner(System.in);
    private static String printDataDecision;

    /*
    Create two sets of custom exception handlers (extending the above matrixchoice)

	a) if any key but 1) 2) or 3) are selected
	b) if an invalid value is passed to refer to an item in the matrix of dice
     */


    public static void main(String[] args) throws IOException {
        String screenOnly = "screen only";
        String printFile = "print on file";
        String bothPrint = "both";
        try {
            System.out.println("Do you want to print on screen only, print on file, or both?");
            printDataDecision = scnr.nextLine();
            throw new exceptionType();
        }catch(exceptionType s){
            System.out.println("Error, input only Screen Only, print on file, or both.");
        }

        if (printDataDecision.equals(screenOnly)) {

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
            try {
                for (int i = 0; i < diceArray.length; i++) {
                    for (int j = 0; j < diceArray.length; j++) {
                        System.out.format("%-20s", diceArray[i][j]);
                    }

                    System.out.println();
                }
            }catch(ArrayIndexOutOfBoundsException ex){
                System.out.println("Array out of bound!");
            }

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
            try {
                for (int i = 0; i < diceArray.length; i++) {
                    for (int j = 0; j < diceArray.length; j++) {
                        buffer.write(String.format("%-20s", diceArray[i][j]));
                    }
                    buffer.write("\n");

                    //System.out.println();
                }
                buffer.close();
            }catch(ArrayIndexOutOfBoundsException ex){
                System.out.println("Array out of bound!");
            }

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
            try {

                for (int i = 0; i < diceArray.length; i++) {
                    for (int j = 0; j < diceArray.length; j++) {
                        System.out.format("%-20s", diceArray[i][j]);
                        buffer.write(String.format("%-20s", diceArray[i][j]));
                    }
                    System.out.println();

                    //System.out.println();
                }
                buffer.close();
            }catch(ArrayIndexOutOfBoundsException ex){
                System.out.println("Array out of bound!");
            }
        }
    }
}
