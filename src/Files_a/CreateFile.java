// File class from the java.io package, allows us to work with files
// To use the File class, create an object of the class, and specify the filename or directory name.

// To create a file in Jav, you can use the createNewFile() method
// This method returns a boolean value: true of the file was successfully created,
// and false it the file already exits

package Files_a;

import java.io.File; // Import the File class
import java.io.IOException; // import the IOException class to handle erroes

public class CreateFile {
    public static void main(String[] args) {
        try {
            File myObj = new File("filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("File creade: " + myObj.getName());
            } else {
                System.out.println("File already exits");
            }
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}


