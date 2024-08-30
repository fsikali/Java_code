package Files_d;

import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

// In the following example, we use the Scanner class to read the contents
// of the text file we created in the previous chapter
public class ReadFile {
    public static void main(String[] args) {
        try {
            File myObj = new File("/home/fsikali/Desktop/flemming.txt");
            Scanner myReader = new Scanner(myObj);
            while(myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch(FileNotFoundException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}
