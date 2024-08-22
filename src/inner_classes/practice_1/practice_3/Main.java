// Static Inner Class
// A inner class can also be static, meaning you that you can access it
// without creating an object of the outer class
// just like static attributes and methods, a static inner class does not have access
// to members of the outer class

package inner_classes.practice_1.practice_3;
class OuterClass {
    int x = 10;

    static class InnerClass {
        int y = 5;
    }
}
    public class Main {
        public static void main(String[] args) {
            //OuterClass myOuter = new OuterClass();
            OuterClass.InnerClass myInner = new OuterClass.InnerClass();
            //OuterClass.InnerClass myInner = myOuter.new InnerClass();
            System.out.println(myInner.y);
        }
    }


