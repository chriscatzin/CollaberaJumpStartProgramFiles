public class assignmentTwo {

    public static void main(String[] args){
        final int coinFlips = 1000;
        int headsTails = 0;
        int tails = 0;
        int heads = 0;

        System.out.println("1000 Coin Flips!");

        for (int tosses = 0; tosses < coinFlips; tosses ++)
        {
            headsTails = (int) (Math.random() * 2) + 1;
            if (headsTails == 1) {
                heads ++;
            } else {
                tails ++;
            }
        }

        System.out.println("You flip a coin 1000 times.\nNumber of heads:" + heads + "\nNumber of tails:" + tails);

    }
}
