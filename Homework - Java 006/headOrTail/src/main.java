import java.util.Scanner;

public class main {

    public static void main(String[] args){
        System.out.println("Welcome to the game of Head or Tail where" +
                " you will flip your life away");
        Scanner keyboard = new Scanner(System.in);
        char key = 'F';
        char quit = 'Q';
        char quitLower = 'q';
        char input;
        getRand random = () -> {
            return (Math.random() <= 0.5) ? 1 : 2;
        };
        valueLamb getCoin = () -> {
            if(random.test() == 1){
                return "The Coin Flip is: Heads";
            }
            else{
                return "The Coin Flip is: Tails";
            }

        };
        System.out.println("Press the F key and flip your luck");
        input = keyboard.next().charAt(0);

        while(input == (key) || (input != (quit) && input != quitLower)) {

            System.out.println(getCoin.getValue());
            System.out.println("“Press the F key to try again, press Q or q to Quit");
            input = keyboard.next().charAt(0);
        }
        System.out.println("Thank you for playing!");
    }
}
