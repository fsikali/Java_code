package Java;

class Vehicle {
    protected String brand = "Ford";
    public String engine;
    public void speed() {
        System.out.println("80KM");
    }
}

class Car extends Vehicle {
    public String modelName = "Mustang";

    public void check() {
        System.out.println("Hi Flemming");
    }

    public void engine_type() {
        System.out.println("The engine type is " + engine);
    }
}

public class Main {
    public static void main(String[] args) {
        Car mycar = new Car() ;

        mycar.engine = "TX";
        mycar.engine_type();
        mycar.speed();
        mycar.check();

        System.out.println(mycar.brand + " " +  mycar.modelName);
    }
}





















