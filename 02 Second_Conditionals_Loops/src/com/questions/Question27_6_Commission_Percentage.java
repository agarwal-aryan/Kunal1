package com.questions;

import java.util.Scanner;

public class Question27_6_Commission_Percentage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the cost of Product: ");
        float cost = input.nextFloat();
        System.out.print("Enter the commission rate: ");
        float rate = input.nextFloat();
        System.out.printf("Commission amount is= %.2f ", ((cost * rate) / 100));
    }
}
