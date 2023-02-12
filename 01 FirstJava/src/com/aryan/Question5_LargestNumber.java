package com.aryan;

import java.util.Scanner;

public class Question5_LargestNumber {
    public static void main(String[] args) {
        //Take 2 numbers as input and print the largest number.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number :");
        int a = input.nextInt();
        System.out.print("Enter Second Number :");
        int b = input.nextInt();
        if (a > b) {
            System.out.println(a + " is Greatest");
        } else {
            System.out.println(b + " is Greatest");
        }
    }
}
