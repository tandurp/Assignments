package com.assignment6;
import java.util.Scanner;
public class Assignment62 {
    public static void main(String[] args){
        Employee emp1 = new Employee("Preethi", "Java Developer", 120000.00);
        Employee emp2 = new Employee("Tandur", "Software Developer", 150000.00);
        emp1.calculateSalary(120000.00);
        emp2.calculateSalary(150000.00);

    }
}

class Employee{
    String name;
    String title;
    double salary;
    Scanner sc = new Scanner(System.in);


    public Employee(String name, String title, double salary){
        this.name = name;
        this.title = title;
        this.salary = salary;
    }
    public void calculateSalary(double salary){
        System.out.println("enter the percentage to be increase:");
        double percentage = sc.nextDouble();
        double increase=  salary * percentage/100;
        salary += increase;
        System.out.println("after increase: " +salary);
        display(salary);
    }
    public void display(double salary){
        System.out.println("Employee name is:" +name);
        System.out.println("Employee title is:" +title);
        System.out.println("Employee's updated salary is: " +salary);
    }
}