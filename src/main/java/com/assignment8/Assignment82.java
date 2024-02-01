package com.assignment8;

public class Assignment82 {
    public static void main(String[] args){
        Employee obj1 = new Employee();
        obj1.work();
        obj1.getSalary();
        HRManager obj2 = new HRManager();
        obj2.work();
        obj2.addEmployee();
    }
}
class Employee{
    public void work(){
        System.out.println("In parent class's work method");
    }
    public void getSalary(){
        System.out.println("In parent class's salary method");
    }
}
class HRManager extends Employee{
    public void work(){
        System.out.println("In child class's work method");
    }
    public void addEmployee(){
        System.out.println("In child class's new method called addEmployee");
    }
}