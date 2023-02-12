package com.aryan;

import java.util.Scanner;

public class Question3_Simple_Interest {
    public static void main(String[] args) {
//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter principal Value: ");
        float principal = input.nextFloat();
        System.out.print("Enter time Value: ");
        float time = input.nextFloat();
        System.out.print("Enter rate Value: ");
        float rate = input.nextFloat();
        float simple = (principal * time * rate) / 100;
        System.out.println("Simple Interest is : " + simple);
    }
}
