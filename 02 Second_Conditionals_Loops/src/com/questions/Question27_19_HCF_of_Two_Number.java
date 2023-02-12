package com.questions;

import java.util.Scanner;

public class Question27_19_HCF_of_Two_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first Number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second Number: ");
        int num2 = input.nextInt();
        int min = Math.min(num1, num2);
        int a = 0;
        for (int i = 1; i <= min; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                a = i;
            }
        }
        System.out.printf("HCF of %d and %d = %d", num1, num2, a);
    }
}
