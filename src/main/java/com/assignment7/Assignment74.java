package com.assignment7;
public class Assignment74 {
    public static void main(String[] args){
        int sumEven = 0;
        int sumOdd = 0;
        for(int i = 1; i<=20; i++){
            if(i%2 == 0){
                sumEven += i;
            }
            else{
                sumOdd += i;
            }
        }
        System.out.println("The sum of even numbers is: " +sumEven);
        System.out.println("The sum of odd numbers is: " +sumOdd);

    }
}
