public class lambdaPractice {

    interface NumericFunc {
        int func(int n);
    }

    public static void main(String args[]) {
        // This block lambda returns the smallest positive factor of a value.
        NumericFunc smallestF = (n) -> {
            int i, fact = 1;
            int number = 5;//It is the number to calculate factorial
            for (i = 1; i <= number; i++) {
                fact = fact * i;
            }
            return fact;
        };
        System.out.println("Smallest factor of 5 is " +
                        "is " + smallestF.func(5));
    }
}
