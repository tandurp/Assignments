package com.assignment3;
import java.util.Scanner;


public class Assignment33 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        boolean value1 = true;
        boolean value2 = false;
        boolean result = num1==num2 ? num2==num3 ? num3==num4 : value1 : value2;
        System.out.println(result);

    }
}
