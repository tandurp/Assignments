package com.assignment7;
import java.util.Scanner;

public class Assignment71 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for which you need the table: ");
        int num = sc.nextInt();
        for(int i =1; i <= 10; i++){

            int result = num*i;
            System.out.println(" " +num+"*"+" "+i+"="+" "+result);
        }
    }
}
