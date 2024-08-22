// Like abstract classes, interfaces cannot be used to create objects
// Interface methods do not have a body - the body is provided by the "implement" class
// On implementation of an interface, you must override all of its methods
// Interface methods are by default abstract and public
// interface attributes are by default public, static and final
// An interface cannot contain a constructor (as it cannot be used to create objects)

// Why use interfaces
// - To achieve security  - hide certain details and only show the important details
// of an object (interface)
// Java does not support "multiple inheritance" (a class can only inherit from one superclass).
// However, it can be achieved with interfaces, because the class can implement multiple interfaces.
// N/B - To implement multiple interfaces, separate them with a comma

// Example

package practice_2;

interface FirstInterface {
    public void myMethod(); // interface method
}

interface SecondInterface {
    public void myOtherMethod(); // interface method
}

class DemoClass implements FirstInterface, SecondInterface {
    public void myMethod() {
        System.out.println("Some text....");
    }
    public void myOtherMethod() {
        System.out.println("Some other text....");
    }
}

class Main {
    public static void main(String[] args) {
        DemoClass myObj = new DemoClass();
        myObj.myMethod();
        myObj.myOtherMethod();
    }
}
