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
public class Person {
    private String name; // private = restricted area
    private int age;

    // Getter
    public String getName() {
        return name;
    }
    // Setter
    public void setName(String newName) {
        this.name = newName;
    }
    // Getter
    public int getAge() {
        return age;
    }
    // Setter
    public void setAge(int myage) {
        this.age = myage;
    }
}






