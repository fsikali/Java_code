package Exceptions_a;

// When executing Java code, different errors can occur: coding errors
// made by the programmer, errors due to wrong input, or other unforeseeable things

// When errors occurs, Java will normally stop and generate an error message
// The technical term for this is: Java will throw an exception (throw an error)

// Java try and catch
// try - statement allows you to define a block of code to be tested for errors while it is being executed
// catch - statement allows you to define a block of code to be executed, if an error occurs in the try block
// The try and catch keywords come in pairs

// try {
//
//  Block of code to try
//
//   }
//
//  catch(Exception e) {
//
//   Block of code to handle errors
//
//  }
//
// Example - Use the try...catch to catch the error and execute some code to handle it
public class Main {
    public static void main(String[] args) {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
    }
}
