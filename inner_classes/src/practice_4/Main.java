// Access Outer Class From Inner Class
// Inner classes, can access attributes and methods of the outer class

package practice_4;
class OuterClass {
    int x = 10;

    class InnerClass {
        public int myInnerMethod() {
            return x;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.myInnerMethod());
    }
}

