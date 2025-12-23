package oops;


// Example1

//class Animal{
//    public void eat(){
//        System.out.println("Animal eats");
//    }
//}
//class Dog extends Animal{
//
//}
//public class Inheritance {
//    public static void main(String[] args){
//        Dog animal1 = new Dog();
//        animal1.eat();
//    }
//
//}


//Example 2


class Vehicle{
    public void startEngine(){
        System.out.println("Vehicle starts the engine");
    }
}
class Car extends Vehicle{
    public void drive(){
        System.out.println("Car drives faster");
    }
}
class ElectricCar extends Car{
    public void batteryCharges(){
        System.out.println("Electric car runs on charging battery");
    }
}

public class Inheritance {
    public static void main(String[] args){
        ElectricCar vehicle1 = new ElectricCar();
        vehicle1.startEngine();
        vehicle1.drive();
        vehicle1.batteryCharges();
    }

}

