package abstraction;// Data abstraction is the process of hiding certain details and showing only essential information to the user
// Abstraction can be achieved with either abstract classes or interfaces
// abstract keyword - Is a non-access modifier,  used for classes and methods
// Abstract class: Is a restricted class that cannot be used to create objects
// (to access it, it must be inherited from another class)
// Abstract method: can only be used in an abstract class, and it does not have a body.
//  The body is provided by the subclass(inherited from)
// An abstract class can have both abstract and regular methods

// Abstract class
abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void animalSound();
    // Regular method
    public void sleep() {
        System.out.println("Zzz");
    }
}

// Subclass (inherit from abstraction.Animal)
class Pig extends Animal {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
}

class Main {
    public static void main(String[] args) {
        Pig myPig = new Pig(); // Create a abstraction.Pig object
        myPig.animalSound();
        myPig.sleep();
    }
}