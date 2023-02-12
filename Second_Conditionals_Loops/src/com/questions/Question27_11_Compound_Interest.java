package com.questions;

import java.util.Scanner;

public class Question27_11_Compound_Interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principal amount: ");
        float p = input.nextFloat();
        System.out.print("Enter Rate of Interest: ");
        float r = input.nextFloat();
        System.out.print("Enter Time: ");
        float t = input.nextFloat();
        float A = (float) (p * Math.pow((1 + (r / 100)), t));
        System.out.printf("Compound Interest = %.2f", (A - p));

    }
}
