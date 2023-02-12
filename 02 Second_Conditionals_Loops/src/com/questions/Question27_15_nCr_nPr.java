package com.questions;

import java.util.Scanner;

public class Question27_15_nCr_nPr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = input.nextInt();
        System.out.print("Enter value of r: ");
        int r = input.nextInt();
        double P = fact(n) / fact(n - r);
        double C = fact(n) / (fact(r) * fact(n - r));
        System.out.print("Value of nCr = " + C + "\n");
        System.out.print("Value of nPr = " + P);
    }

    public static double fact(int a) {
        double fact = 1;
        for (int i = 1; i < a + 1; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
