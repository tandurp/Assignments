package com.assignment1;

public class Assignment11 {
    public static void main(String[] args) {

        int StudentNumber = 1;
        float StudentHeight = 4.10f;
        double StudentWeight = 47.60;
        boolean IsStudent = true;
        char StudentName = 'p';
        String[] studentNames = new String[3];

        studentNames[0] = "preethi";
        studentNames[1] = "vennela";
        studentNames[2] = "spoorthy";
        System.out.println("Student number is " + StudentNumber);
        System.out.println("Student height is " + StudentHeight);
        System.out.println("Student weight is " + StudentWeight);
        System.out.println("Is he or she a student? " + IsStudent);
        System.out.println("Student name is " + StudentName);
        System.out.println("first name in the array is " + studentNames[0]);
        System.out.println("last name in the array is " + studentNames[2]);


    }
}