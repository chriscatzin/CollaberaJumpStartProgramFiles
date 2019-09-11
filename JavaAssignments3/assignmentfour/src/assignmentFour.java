import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class assignmentFour {

    public static void main(String[] args) throws IOException {
        /*==============================================================================================
            Create an application which does the following:

	        creates a two-dimensional array which will hold phonebook data;

	        Rows are records
	        Column 0 = name
	        Column 1 = phone number
	        Column 2 = city

	        Ensure you can input 5 rows of data using keyboard entry

	        Upon completion, ensure you can print both on screen and on file "phone.txt" the info
	        which has been displayed.

	        The output on both screen and display should be as follows:

	        PhoneBook App
	        Name		Phone		City
	        asas		asas		asas

	        5 rows of data

	        the file will be formatted in the exact same way.

	        Added requirement, if any entry is empty, a custom exception is raised and the user
	        is asked to retry again

	        Added requirement, when a user enters a row of data, they get a feedback message displaying
	        the entered data in a line and the ability to either accept the row of the data or type a
	        new row of data.
         ===================================================================================================*/

        int stop = -1;
        String name;
        String phoneNumber;
        String city;
        final int NUM_ROWS = 5;
        final int NUM_COLS = 3;
        FileWriter fileWriter = new FileWriter("phonebook.txt");
        BufferedWriter buffer = new BufferedWriter(fileWriter);
        String[][] array = new String[NUM_COLS][NUM_ROWS];
        Scanner keyboard = new Scanner(System.in);

        for (int index = 0; index < 5; index++) {
            System.out.printf("Enter a name for your phonebook: ");
            name = keyboard.nextLine();
            array[0][index] = name;
            System.out.printf("Enter a phone number for your phonebook: ");
            phoneNumber = keyboard.nextLine();
            array[1][index] = phoneNumber;
            System.out.printf("Enter a city for your phonebook: ");
            city = keyboard.nextLine();
            array[2][index] = city;
        }
        System.out.format("%-15s %-15s %-15s", "name","phone number", "city");
        System.out.println("\n");
        System.out.print("==========================================");
        System.out.println("\n");

        for (int index = 0; index < 5; index++) {
            System.out.format("%-15s", array[0][index]);
            System.out.format("%-15s", array[1][index]);
            System.out.format("%-15s", array[2][index]);
            System.out.println("\n");
            buffer.write(String.format("%-15s %-15s %-15s", "name","phone number", "city"));
            buffer.write("\n");
            buffer.write("==========================================");
            buffer.write(String.format("%-15s",array[0][index]));
            buffer.write(String.format("%-15s",array[1][index]));
            buffer.write(String.format("%-15s",array[2][index]));
            buffer.write("\n");
        }
        buffer.close();
    }
}