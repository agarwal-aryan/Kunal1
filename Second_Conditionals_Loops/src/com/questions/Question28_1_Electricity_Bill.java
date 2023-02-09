package com.questions;

import java.util.Scanner;

public class Question28_1_Electricity_Bill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter rate of per unit Electricity: ");
        float rate = input.nextFloat();
        System.out.print("Enter number of units used: ");
        float unit = input.nextFloat();
        System.out.printf("Bill Amount = %.2f", (rate * unit));
    }
}
