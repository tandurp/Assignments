package com.assignment6;

public class Assignment61 {

    public static void main(String[] args){
        Person p1 = new Person("Preethi", 25);
        Person p2 = new Person("Tandur", 26);
        p1.display();
        p2.display();
    }
}
class Person{
    String name;
    int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void display(){
        System.out.println("Name of the person is: " +name);
        System.out.println("Age of the person is: " +age);
    }

}
