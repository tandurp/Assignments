package com.assignment5;

import java.util.Scanner;


public class Assignment51 {
    public static void main(String []args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer value:");
        int num = sc.nextInt();
        String after = Integer.toString(num);
        System.out.println("converted integer in string format is: " + after);
        System.out.println("Enter the string value:");
        String str = sc.next();
        try {
            int value = Integer.parseInt(str);
            System.out.println("Converted string value in integer format: " + value);
        }
        catch (NumberFormatException e){
            System.out.println("Invalid input, enter a valid integer value");

        }

    }
}
