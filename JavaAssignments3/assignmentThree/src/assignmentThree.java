import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class assignmentThree {

    public static void main(String[] args) throws IOException {
        /*
            Create a utility to compare two files using command prompt arguments
		hint: FileInputStream could be used

		> Compare file.txt file2.txt

		Output: file.txt and file2.txt:
		Result: identical content
				character length for both: XX
		  or
		Result: different content
				character length for file.txt: XX
				character length for file2.txt: YY
         */
        int characterCount = 0;
        int characterCount2 = 0;

        BufferedReader reader1 = null;
        try {
            reader1 = new BufferedReader(new FileReader("readFileOne.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        BufferedReader reader2 = null;
        try {
            reader2 = new BufferedReader(new FileReader("readFileTwo.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String line1 = reader1.readLine();
        if(line1 != null){
            //System.out.println(line1.length());
            characterCount += line1.length();
            //characterCount++;
        }

        String line2 = reader2.readLine();
        if(line2 != null){
            characterCount2 += line2.length();
        }

        boolean areEqual = true;

        int lineNum = 1;

        while (line1 != null || line2 != null)
        {
            if(line1 == null || line2 == null)
            {
                areEqual = false;

                break;
            }
            else if(! line1.equalsIgnoreCase(line2))
            {
                areEqual = false;

                break;
            }

            line1 = reader1.readLine();

            line2 = reader2.readLine();

            lineNum++;
        }



        if(areEqual)
        {
            System.out.println("Output: readFileOne.txt and readFileTwo.txt." );
            System.out.println("Result: identical content.\n" +
                    "character length for both: " + characterCount);

        }
        else
        {
            System.out.println("Result: different content at line: "+lineNum);

            System.out.println("character length for readFileOne.txt: " + characterCount );
            System.out.println("character length for readFileTwo.txt: " + characterCount2 );

        }

        reader1.close();

        reader2.close();
    }
}
