package com.bridgelabz;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First number: ");
        int firstNumber = input.nextInt();
        System.out.println("Enter Second number: ");
        int secondNumber = input.nextInt();

        System.out.println("--Before swap--");
        System.out.println("First number = " + firstNumber);
        System.out.println("Second number = " + secondNumber);

        //Value of first number is assigned to temporary variable
        int temporary = firstNumber;

        //Value to second is assigned to first
        firstNumber = secondNumber;

        //Value of temporary (which contains the initial value of first) is assigned to second
        secondNumber = temporary;

        System.out.println();
        System.out.println("--After swap--");
        System.out.println("First number = " + firstNumber);
        System.out.println("Second number = " + secondNumber);
    }
}
