package com.assignment2;

public class Assignment23
{
    public static void main(String[] args){
        String studentName = "Robert";
        int mathsMarks = 78;
        int physicsMarks = 45;
        int chemistryMarks = 62;
        int total;
        double percentage;
        total = mathsMarks+physicsMarks+chemistryMarks;
        percentage = (double) total / 300 * 100;
        System.out.println("total marks of robert are " +total);
        System.out.println("" +studentName+" percentage is " +percentage);




    }
}
