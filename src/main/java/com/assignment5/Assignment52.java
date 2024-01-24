package com.assignment5;
import java.util.Scanner;
public class Assignment52 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.next();
        try{
            float value = Float.parseFloat(str);
            System.out.println("after conversion: " +value);
        }
        catch (NumberFormatException e){
            System.out.println("invalid float value, enter the valid float string");
        }
    }
}
