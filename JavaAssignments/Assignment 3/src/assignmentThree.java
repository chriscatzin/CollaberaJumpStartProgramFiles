import java.util.Scanner;

public class assignmentThree {

    public static void main(String[] args){
        char rollDice;
        char quit = 'Q';
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Press any key to throw a die" +
                "and press Enter (or Q and Enter to quit)");
        rollDice = keyboard.next().charAt(0);

        while(rollDice != quit){
            int dice=(int)(Math.random()*6+1);
            System.out.println("You have rolled a " + dice);
            System.out.println("Play Again? (Y or y) and Enter " +
                    ", any other key and Enter to Quit");
            rollDice = keyboard.next().charAt(0);
        }

    }
}
