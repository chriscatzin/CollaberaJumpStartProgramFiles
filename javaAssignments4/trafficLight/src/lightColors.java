import java.util.Scanner;

public class lightColors implements Runnable {

    public void run() {
        colorFiles green = colorFiles.GREEN;
        colorFiles yellow = colorFiles.YELLOW;
        colorFiles red = colorFiles.RED;
        String go = "go";
        String exit = "";
        String stop;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Type \"go\" to continue or Enter to Exit.");
        stop = keyboard.nextLine();
        while (go.equalsIgnoreCase(go) != stop.equalsIgnoreCase(exit)) {
            System.out.println("Light is " + green + " - Go!");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Light is " + yellow + " - Beware!");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Light is " + red + " - Stop!");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Type \"go\" to continue or Enter to Exit.");
            stop = keyboard.nextLine();

        }
    }

    public void escape(){
        String stop;
        String exit = "";
        Scanner keyboard = new Scanner(System.in);
        stop = keyboard.nextLine();
        if(stop.equalsIgnoreCase(exit)){
            System.exit(0);
        }
    }
}