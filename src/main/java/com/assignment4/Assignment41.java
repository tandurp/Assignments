package com.assignment4;
class Animal{
    private String species;
    private String sound;

    public Animal(String species, String sound){
        this.species = species;
        this.sound = sound;

    }
    public void makeSound(){
        System.out.println("The " +species + " makes a " + sound + " sound");
    }
}
class Car{
    private String make;
    private String model;
    private int year;
    public Car(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;

    }
    public void displayInfo(){
        System.out.println(year+ " " + make + " " + model );
    }
}
class Person{
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void personInfo(){
        System.out.println("Hi, my name is " + name+ ", I am " + age + " year's old and a " +gender);
    }
}
class Employee{
    private int employeeId;
    private String name;
    private String position;
    private int salary;

    public Employee(int employeeId, String name, String position, int salary){
        this.employeeId=employeeId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
    public void employeeInfo(){
        System.out.println("EmployeeId: " +employeeId);
        System.out.println("Employee name: " +name);
        System.out.println("Employee position: " +position);
        System.out.println("Employee salary: " +salary);
    }
}
class Assignment41 {
    public static void main(String[] args) {
        Animal cat = new Animal("Cat","Meow");
        cat.makeSound();
        Car myCar = new Car("Toyota", "camry", 2022);
        myCar.displayInfo();
        Person person = new Person("preethi", 25, "female");
        person.personInfo();
        Employee employee = new Employee(101, "preethi","java developer",120000);
        employee.employeeInfo();

    }
}