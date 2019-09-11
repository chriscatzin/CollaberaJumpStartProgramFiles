package arrayutils;

import java.util.Arrays;

public class assignment9 {

    public static void main(String[] args){
            String myList[] = {"Bozo", "FooBar", "Delta", "Foozball", "Demo", "Money", "Zoo"};
            boolean found;
            int foundArray[];
            System.out.println("This is the a test of the arrayHasExactMatch" +
                    "and indexOfOccurenceInArray methods");
            System.out.println("The array to test contains the following items");
            System.out.println(Arrays.toString(myList));

            System.out.println("Scenario 1");
            found = methodFile.arrayHasExactMatch(myList, "zo", false);
            System.out.println("arrayHasExactMatch (myList, \"zo\", false): is " + found);
            System.out.println();

            System.out.println("Scenario 2");

            found = methodFile.arrayHasExactMatch(myList, "zoo", false);
            System.out.println("arrayHasExactMatch (myList, \"zoo\", false): is " + found);
            System.out.println();

            System.out.println("Scenario 3");

            found = methodFile.arrayHasExactMatch(myList, "zoo", true);
            System.out.println("arrayHasExactMatch (myList, \"zoo\", true): is " + found);
            System.out.println();

            System.out.println("Scenario 4");

            found = methodFile.arrayHasExactMatch(myList, "foo", true);
            System.out.println("arrayHasExactMatch (myList, \"foo\", true): is " + found);
            System.out.println();

            System.out.println("Scenario 5");

            found = methodFile.arrayHasExactMatch(myList, "foo", false);
            System.out.println("arrayHasExactMatch (myList, \"foo\", false): is " + found);
            System.out.println();

            System.out.println("Scenario 6");
            found = methodFile.arrayHasExactMatch(myList, "delta", true);
            System.out.println("arrayHasExactMatch (myList, \"delta\", true): is " + found);
            System.out.println();

            System.out.println("Scenario 7");
            found = methodFile.arrayHasExactMatch(myList, "Delta", true);
            System.out.println("arrayHasExactMatch (myList, \"Delta\", true): is " + found);
            System.out.println();

            System.out.println("Scenario 8");
            foundArray = methodFile.indexOfOccuranceInArray(myList, "zo", false);
            System.out.println("indexOfOccuranceInArray (myList, \"zo\", false): is " +
                    Arrays.toString(foundArray));
            System.out.println();

            System.out.println("Scenario 9");
            foundArray = methodFile.indexOfOccuranceInArray(myList, "zoo", false);
            System.out.println("indexOfOccuranceInArray (myList, \"zoo\", false): is " +
                    Arrays.toString(foundArray));
            System.out.println();

            System.out.println("Scenario 10");
            foundArray = methodFile.indexOfOccuranceInArray(myList, "zoo", true);
            System.out.println("indexOfOccuranceInArray (myList, \"zo\", true): is " +
                    Arrays.toString(foundArray));
            System.out.println();

            System.out.println("Scenario 11");
            foundArray = methodFile.indexOfOccuranceInArray(myList, "foo", true);
            System.out.println("indexOfOccuranceInArray (myList, \"foo\", true): is " +
                    Arrays.toString(foundArray));
            System.out.println();

            System.out.println("Scenario 12");
            foundArray = methodFile.indexOfOccuranceInArray(myList, "foo", false);
            System.out.println("indexOfOccuranceInArray (myList, \"zo\", false): is " +
                    Arrays.toString(foundArray));
            System.out.println();

            System.out.println("Scenario 13");
            foundArray = methodFile.indexOfOccuranceInArray(myList, "delta",true);
            System.out.println("indexOfOccuranceInArray (myList, \"delta\", true): is " +
                    Arrays.toString(foundArray));
            System.out.println();

            System.out.println("Scenario 14");
            foundArray = methodFile.indexOfOccuranceInArray(myList, "Delta", true);
            System.out.println("indexOfOccuranceInArray (myList, \"Delta\", true): is " +
                    Arrays.toString(foundArray));

            foundArray = methodFile.indexOfOccuranceInArray(myList, "zo", false);



        }
    }
