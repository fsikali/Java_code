package practice_1;

class Vehicle {
    protected String brand = "Ford";
    public void speed() {
        System.out.println("80KM");
    }
}

class Car extends Vehicle {
    public String modelName = "Mustang";

    public void check() {
        System.out.println("Hi Flemming");
    }
}

public class Main {
    public static void main(String[] args) {
        Car mycar = new Car() ;

        mycar.speed();
        mycar.check();

        System.out.println(mycar.brand + " " +  mycar.modelName);
    }
}


