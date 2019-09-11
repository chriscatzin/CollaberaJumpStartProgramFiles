import java.util.Scanner;

public class assignmentFour {

    public static void main(String[] args){
        char rollDice;
        char quit = 'Q';
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Press any key to throw a die " +
                "and press Enter (or Q and Enter to quit)");
        rollDice = keyboard.next().charAt(0);

        while(rollDice != quit){
            int dice=(int)(Math.random()*6+1);
            int dice2 = (int)(Math.random()*6) + 1;
            System.out.println("You have rolled the follow: ");
            System.out.println("First Die: " + dice);
            System.out.println("Second Die: " + dice2);
            System.out.println("Play Again? (Y or y) and Enter " +
                    ", any other key and Enter to Quit");
            rollDice = keyboard.next().charAt(0);
        }

    }
}
