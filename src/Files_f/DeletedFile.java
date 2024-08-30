package Files_f;

import java.io.File;

// Delete a File
// To delete a file in Java, use the delete() method
public class DeletedFile {
    public static void main(String[] args) {
        File myObj = new File("/home/fsikali/Desktop/flemming.txt");
        if(myObj.delete()) {
            System.out.println("Deleted the file: " + myObj.getName());
        } else {
            System.out.println("Failed to delete the file");
        }
    }
}
