import java.util.Arrays;

public class assignmentEight {

    public static void main(String[] args) {
        String myList[] = {"Bozo", "FooBar", "Delta", "Foozball", "Demo", "Money", "Zoo"};
        boolean found;
        int foundArray[];
        System.out.println("This is the a test of the arrayHasExactMatch" +
                "and indexOfOccurenceInArray methods");
        System.out.println("The array to test contains the following items");
        System.out.println(Arrays.toString(myList));

        System.out.println("Scenario 1");
        found = arrayHasExactMatch(myList, "zo", false);
        System.out.println("arrayHasExactMatch (myList, \"zo\", false): is " + found);
        System.out.println();

        System.out.println("Scenario 2");

        found = arrayHasExactMatch(myList, "zoo", false);
        System.out.println("arrayHasExactMatch (myList, \"zoo\", false): is " + found);
        System.out.println();

        System.out.println("Scenario 3");

        found = arrayHasExactMatch(myList, "zoo", true);
        System.out.println("arrayHasExactMatch (myList, \"zoo\", true): is " + found);
        System.out.println();

        System.out.println("Scenario 4");

        found = arrayHasExactMatch(myList, "foo", true);
        System.out.println("arrayHasExactMatch (myList, \"foo\", true): is " + found);
        System.out.println();

        System.out.println("Scenario 5");

        found = arrayHasExactMatch(myList, "foo", false);
        System.out.println("arrayHasExactMatch (myList, \"foo\", false): is " + found);
        System.out.println();

        System.out.println("Scenario 6");
        found = arrayHasExactMatch(myList, "delta", true);
        System.out.println("arrayHasExactMatch (myList, \"delta\", true): is " + found);
        System.out.println();

        System.out.println("Scenario 7");
        found = arrayHasExactMatch(myList, "Delta", true);
        System.out.println("arrayHasExactMatch (myList, \"Delta\", true): is " + found);
        System.out.println();

        System.out.println("Scenario 8");
        foundArray = indexOfOccuranceInArray(myList, "zo", false);
        System.out.println("indexOfOccuranceInArray (myList, \"zo\", false): is " +
                Arrays.toString(foundArray));
        System.out.println();

        System.out.println("Scenario 9");
        foundArray = indexOfOccuranceInArray(myList, "zoo", false);
        System.out.println("indexOfOccuranceInArray (myList, \"zoo\", false): is " +
                Arrays.toString(foundArray));
        System.out.println();

        System.out.println("Scenario 10");
        foundArray = indexOfOccuranceInArray(myList, "zoo", true);
        System.out.println("indexOfOccuranceInArray (myList, \"zo\", true): is " +
                Arrays.toString(foundArray));
        System.out.println();

        System.out.println("Scenario 11");
        foundArray = indexOfOccuranceInArray(myList, "foo", true);
        System.out.println("indexOfOccuranceInArray (myList, \"foo\", true): is " +
                Arrays.toString(foundArray));
        System.out.println();

        System.out.println("Scenario 12");
        foundArray = indexOfOccuranceInArray(myList, "foo", false);
        System.out.println("indexOfOccuranceInArray (myList, \"zo\", false): is " +
                Arrays.toString(foundArray));
        System.out.println();

        System.out.println("Scenario 13");
        foundArray = indexOfOccuranceInArray(myList, "delta",true);
        System.out.println("indexOfOccuranceInArray (myList, \"delta\", true): is " +
                Arrays.toString(foundArray));
        System.out.println();

        System.out.println("Scenario 14");
        foundArray = indexOfOccuranceInArray(myList, "Delta", true);
        System.out.println("indexOfOccuranceInArray (myList, \"Delta\", true): is " +
                Arrays.toString(foundArray));

        foundArray = indexOfOccuranceInArray(myList, "zo", false);



    }

    public static boolean arrayHasExactMatch(String arrayList[], String methodList, boolean find){
        boolean point = false;
        for(int index = 0; index < arrayList.length; index++){
            if(find == true){
                if(arrayList[index].equals(methodList)) {
                    point = true;
                }
            }
            else{
                if(arrayList[index].equalsIgnoreCase(methodList)){
                    point = true;
                }
            }
        }
        return point;
    }

    public static int[] indexOfOccuranceInArray(String arrayList[], String methodList, boolean find){
        int newArray[];
        int tempArray[] = new int[arrayList.length];
        int counter = 0;
        for(int index = 0; index < arrayList.length; index++){
            if(find == true){
                if(arrayList[index].equals(methodList)){
                    tempArray[counter] = index;
                    counter++;
                }
            }
            else{
                if(arrayList[index].equalsIgnoreCase(methodList)){
                    tempArray[counter] = index;
                    counter++;
                }
            }
        }
        if(counter != 0){
            newArray = new int[counter];
            for(int index = 0; index < counter; index++){
                newArray[index] = tempArray[index];
            }
        }
        else{
            newArray = new int[1];
            newArray[0] = -1;
        }
        return newArray;
    }
}