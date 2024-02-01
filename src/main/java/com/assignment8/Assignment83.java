package com.assignment8;
import java.util.Scanner;
public class Assignment83 {
    public static void main(String[] args){
        BankAccount obj1 = new BankAccount();
        obj1.deposit();
        obj1.withdraw();
        SavingsAccount obj2 = new SavingsAccount();
        obj2.withdraw();

    }
}
class BankAccount{
    Scanner sc = new Scanner(System.in);
    int depositCash;
    int withdrawCash;

    public void deposit(){
        System.out.println("Enter cash to do the deposit:");
        depositCash = sc.nextInt();

    }
    public void withdraw(){
        System.out.println("Enter amount to do the withdraw:");
        withdrawCash = sc.nextInt();
        int balance = depositCash-withdrawCash;
        System.out.println("The balance after withdrawal is: " +balance);

    }

}
class SavingsAccount extends BankAccount{
    public void withdraw(){
        System.out.println("Entered amount to withdraw is: " +withdrawCash);
        int balance = depositCash-withdrawCash;
        if(balance<=100){
            System.out.println(" The available balance is less than 100");
        }
        else{
            System.out.println("The balance after withdrawal is: " +balance);
        }



    }

}