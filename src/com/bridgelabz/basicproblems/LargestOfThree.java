package com.bridgelabz;

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double n1 = input.nextDouble();
        System.out.println("Enter the second number: ");
        double n2 = input.nextDouble();
        System.out.println("Enter the three number: ");
        double n3 = input.nextDouble();

        if (n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the largest number.");

        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is the largest number.");

        else
            System.out.println(n3 + " is the largest number.");
    }
}
