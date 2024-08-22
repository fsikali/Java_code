// In Java, it is also possible to nest classes( a class within a class)
// This helps to group classes that belong together, which make your code more readable and maintainable
// To access the inner class, create an object of the outer class, and then create an object of the inner class

// Example

package inner_classes.practice_1.practice_2;
class OuterClass {
    int firstScore = 10;

    class InnerClass {
        int  secondScore = 5;
    }
}

public class Outer {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.secondScore + myOuter.firstScore);
    }
}
















