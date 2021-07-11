package com.company;

import java.util.Scanner;

public class JavaTraining {

    public static void main(String[] args){

        //Create scanner to get user input
        Scanner scanner = new Scanner(System.in);

        //Ask user for hours worked
        System.out.println("Please enter the number of hours worked this week");

        //Store user hours worked into hoursWorked variable that only accepts integers
        double hoursWorked = scanner.nextInt();

        //Ask user for hourly pay rate
        System.out.println("Please enter your hourly pay rate");

        //Store user hour rate into payRate variable that only accepts integers
        double payRate = scanner.nextInt();
        //close scanner as it is not needed anymore in the program
        scanner.close();

        //Multiply hours worked by pay rate to get weekly pay
        double results = hoursWorked * payRate;
        System.out.println("Your pay for this week is:" + " "+ results);
    }
}
