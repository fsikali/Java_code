package Files_e;

import java.io.File; // Import the File class

// Get File Information
// To get more information about a file, use any of the File methods:

public class GetFileInfo {
    public static void main(String[] args) {
        File myObj = new File("/home/fsikali/Desktop/flemming.txt");
        if(myObj.exists()) {
            System.out.println("File name: " + myObj.getAbsolutePath());
            System.out.println("Absolute path: " + myObj.getAbsolutePath());
            System.out.println("Writeable: " + myObj.canWrite());
            System.out.println("Readable " + myObj.canRead());
            System.out.println("File size in bytes " + myObj.length());
        } else {
            System.out.println("The file does not exist");
        }
    }
}
