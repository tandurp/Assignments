package com.assignment3;
import java.util.Scanner;
import java.lang.Math;


public class Assignment32 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        System.out.println("Entered value is: " +value);
        double square = Math.pow(value,2);
        double cube = Math.pow(value,3);
        double four = Math.pow(value,4);
        System.out.println("Square value is: " +square);
        System.out.println("Cube value is: " +cube);
        System.out.println("Four value is: " +four);

    }
}
