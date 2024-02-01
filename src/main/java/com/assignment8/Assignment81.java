package com.assignment8;

public class Assignment81 {
    public static void main(String[] args){
        Vehicle obj1 = new Vehicle();
        obj1.drive();
        Car obj2 = new Car();
        obj2.drive();

    }
}

class Vehicle{
    public void drive(){
        System.out.println("Parent class method");
    }
}

class Car extends Vehicle{

    public void drive(){
        System.out.println("Repairing the car in child class");
    }
}
