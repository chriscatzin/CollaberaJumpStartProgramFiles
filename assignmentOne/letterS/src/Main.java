import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String s = "This Sentence extracts all s, so salutations.";

        for (String st : s.split(" ")) {
            if (st.startsWith("s")) {
                System.out.println(st);
            }
        }
    }
}
