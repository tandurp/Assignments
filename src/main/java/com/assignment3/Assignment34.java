package com.assignment3;
import java.util.Scanner;

public class Assignment34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = num%2;
        if(result==0){
            System.out.println("The entered number is even");
        }
        else{
            System.out.println("The entered value is odd");
        }
    }
}