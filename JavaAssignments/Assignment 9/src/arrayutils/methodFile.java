package arrayutils;

public class methodFile {

    static boolean arrayHasExactMatch(String arrayList[], String methodList, boolean find){
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

    static int[] indexOfOccuranceInArray(String arrayList[], String methodList, boolean find){
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
