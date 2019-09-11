public class assignmentFive {

    public static final int diceToss = 1000;

    /*

    public static void main(String[] args) {
        //int d1 = 0, d2 = 0, d3 = 0, d4 = 0, d5 = 0,  d6 = 0;
        int[] d1;
        int[] d2;
        int[] d3;
        for (int index = 0; index < diceToss; index++) {
            int roll = (int)(6.0*Math.random() + 1.0);
            if (roll == 1 || roll == 2){
                d1++;
            }
            else if (roll == 6 || roll == 5){
                d2++;
            }
            else if (roll == 4 || roll == 3){
                d3++;
            }
        }
        System.out.println("1000 Random 2 dice toss stats");
        System.out.println("Dice 2 and 1: " + d1);
        System.out.println("Dice 6 and 5: " + d2);
        System.out.println("Dice 4 and 3: " + d3);
    }
     */
    public static void main(String[] args) {
        int[] d = new int[7];
        for (int i = 1; i < 7; i++){
            d[i] = 0;
        }

        for (int k = 0; k < diceToss; k++) {
            int roll = (int)(6.0*Math.random() + 1.0);
            d[roll]++;
        }
        System.out.print("Rolls: " + diceToss);
        for (int i = 1; i < 7; i++) {
            System.out.print(", " + i + ": " + d[i]);
        }
        System.out.println();
    }
}
