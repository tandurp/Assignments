package com.assignment7;
import java.util.Scanner;
public class Assignment73 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month number to find the month name: ");
        int monthNumber = sc.nextInt();
        String monthName = getMonthName(monthNumber);
        if(monthName != null){
            System.out.println("The month name is: " +monthName);
        }
        else{
            System.out.println("Invalid input");
        }

    }
    public static String getMonthName(int monthNumber){
        String monthName;
        switch (monthNumber){
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                monthName = null;
        }
        return monthName;
    }
}
