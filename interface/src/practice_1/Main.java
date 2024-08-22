// An interface is completely "abstract class" that is used to group related methods
// with empty bodies
// To access the interface methods, the interface must be "implementer" / inherited by
// another class with the implements keyword (instead of extends). The body of the interface method
// is provided by the "implement" class

// Interface
package practice_1;
interface Animal {
    public void animalSound(); // interface interface  method (does not have a body)
    public void sleep(); // interface method (does not have a body)
}

// Pig "implements" the Animal interface
class Pig implements Animal {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }

    public void sleep() {
        // The body of sleep() is provided here
        System.out.println("Zzz");
    }
}

class Main {
    public static void main(String[] args) {
        Pig myPig = new Pig(); // Create a Pig object
        myPig.animalSound();
        myPig.sleep();
    }
}
