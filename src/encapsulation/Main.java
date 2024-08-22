// The meaning of encapsulation is to make sure sensitive data is hidden from the user
// To achieve this:
// You must declare the class variables/attributes as private
// Provide public get and set methods to access and update the value a private variable
// private variables - can only be accessed within the same class ( an outside class has no access to it )
// It is possible to access them if we have the set and get method
// get - returns the variable value
// set - sets the value
// syntax - they start with either get or set, followed by the name of the variable, with the first
// letter in upper case

package encapsulation;
public class Main {
    public static void main(String[] args) {
        Person student = new Person();
        student.setName("John"); // set the value of the name variable to "John"
        student.setAge(12);
        System.out.println("My name is " + student.getName() + " and I am " + student.getAge() + " years old");

    }
}

















