package oops;

abstract class Vehicle1 {

    // abstract method no definition only declaration
    abstract void start();

    // concrete method
    void fuel() {
        System.out.println("Vehicle needs fuel");
    }
}

class Car1 extends Vehicle1 {

    @Override
    void start() {
        System.out.println("Car starts with a key");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Vehicle1 v = new Car1();   // abstraction
        v.start();
        v.fuel();
    }
}

