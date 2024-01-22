package com.assignment3;
import java.util.Scanner;
public class Assignment31{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int inches = sc.nextInt();
        System.out.println("Enter the inches value: " +inches);
        double meters = (double)inches * 0.0254;
        System.out.println("The entered value in meters is: " +meters);
    }
}