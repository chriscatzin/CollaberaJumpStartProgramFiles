import java.sql.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Random;

public class Main {

    public static void getInput() {

        ClientStore myStore = new ClientStore("clients_list.csv");
        Client[] store = myStore.getClientStore();
        //Seats[] seats = myStore.getSeatStore();
        String[][] getSeats = new String[10][10];


        System.out.println("\n");
        System.out.println("- DataCount: " + myStore.getClientDataCount());
        System.out.println("\nThis is a list of all the data in the store\n");
        Random getRandom = new Random();
        int randomNumber = getRandom.nextInt(getSeats.length);
        int randomNumber2 = getRandom.nextInt(getSeats.length);
        int randomNumber3 = getRandom.nextInt(getSeats.length);
        int randomNumber4 = getRandom.nextInt(getSeats.length);
        int randomNumber5 = getRandom.nextInt(getSeats.length);
        int randomNumber6 = getRandom.nextInt(getSeats.length);
        int randomNumber7 = getRandom.nextInt(getSeats.length);
        int randomNumber8 = getRandom.nextInt(getSeats.length);
        int randomNumber9 = getRandom.nextInt(getSeats.length);
        int randomNumber10 = getRandom.nextInt(getSeats.length);
        // iterate via the array of store.
        System.out.println("|| ID " + "|| " + "   LAST NAME " + "    || " + "     FIRST NAME " + "      || ");
        for(Client c : store) {
            if(c != null) {
                System.out.println(c.getFullClientString());
            }
                getSeats[randomNumber][randomNumber] = c.getClientInitials() + "/" + c.getClientId();
                getSeats[randomNumber2][randomNumber2] = c.getClientInitials() + "/" + c.getClientId();
                getSeats[randomNumber3][randomNumber3] = c.getClientInitials() + "/" + c.getClientId();
                getSeats[randomNumber4][randomNumber4] = c.getClientInitials() + "/" + c.getClientId();
                getSeats[randomNumber5][randomNumber5] = c.getClientInitials() + "/" + c.getClientId();
                getSeats[randomNumber6][randomNumber6] = c.getClientInitials() + "/" + c.getClientId();
                getSeats[randomNumber7][randomNumber7] = c.getClientInitials() + "/" + c.getClientId();
                getSeats[randomNumber8][randomNumber8] = c.getClientInitials() + "/" + c.getClientId();
                getSeats[randomNumber9][randomNumber9] = c.getClientInitials() + "/" + c.getClientId();
                getSeats[randomNumber10][randomNumber10] = c.getClientInitials() + "/" + c.getClientId();
        }

        System.out.println();
        System.out.println();



        for(int row = 0; row < 10; row++){
            for(int col = 0; col < 10; col++){
                if(getSeats[row][col] == null){
                    System.out.print("Vacant" + "\t" );
                }
                else{
                    System.out.format("%-8s", getSeats[randomNumber][randomNumber]);
                }
            }
            System.out.println("\n");
        }


        System.out.println();
        System.out.println();

    }

    public static void main(String[] args) {
        getInput();
    }

}