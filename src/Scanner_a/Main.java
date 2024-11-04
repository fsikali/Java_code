package Scanner_a;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Creating an object of the Scanner class
        Scanner book = new Scanner(System.in);

        // Reading a String input
        System.out.println("Enter the book name: ");
        String book_name = book.nextLine();

        // Reading an Integer input
        System.out.println("Enter the book number: ");
        int book_number =  book.nextInt();

        System.out.println("The book " + book_name + " is number " + book_number);

    }
}
