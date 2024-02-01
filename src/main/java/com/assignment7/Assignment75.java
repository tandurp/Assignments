package com.assignment7;
import java.util.Scanner;

public class Assignment75 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the factorial:");
        int num = sc.nextInt();
        long result = getFactorial(num);
        System.out.println("The factorial of given number is: " +result);
    }

    public static long getFactorial(int num){
        long result;
        if(num == 1 || num == 0){
            return 1;
        }
        else{
            return num * getFactorial(num-1);
        }

    }
}

