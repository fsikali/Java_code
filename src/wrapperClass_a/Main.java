package wrapperClass_a;

// Wrapper classes provide a way to use primitive data types (int, boolean) as objects
// Sometimes you must use wrapper classes e.g. when working with Collection objects, such as
// ArrayList, where primitive types cannot be used (the list can only store objects)

// Example - Creating Wrapper Objects
// To create a wrapper object, use the wrapper class instead of the primitive type
// To get the value, you can just print the object
public class Main {
    public static void main(String[] args) {
         Integer myInt = 5;
         Double myDouble = 5.99;
         Character myChar = 'A';
         System.out.println(myInt);
         System.out.println(myDouble);
         System.out.println(myChar);
    }
}

// Since you're now working with objects, you can use certain methods to get information about
// specific object
//  Check for the methods
// The next example i.e. wrapperClass_b will output the same result as this
