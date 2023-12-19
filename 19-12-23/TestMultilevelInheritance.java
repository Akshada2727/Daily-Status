
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}


class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving...");
    }
}


class SportsCar extends Car {
    void accelerate() {
        System.out.println("SportsCar is accelerating...");
    }
}


public class TestMultilevelInheritance {
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar();

      
        sportsCar.start();      
        sportsCar.drive();      
        sportsCar.accelerate(); 
    }
}


