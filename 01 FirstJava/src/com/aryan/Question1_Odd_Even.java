package com.aryan;

import java.util.Scanner;

public class Question1_Odd_Even {
    public static void main(String[] args) {
        //Write a program to print whether a number is even or odd, also take input from the user.

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number:-");
        int a = input.nextInt();
        if (a % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }
}
