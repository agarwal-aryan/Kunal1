package com.questions;

import java.util.Scanner;

public class Question27_1_Factorial_Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int a = input.nextInt();
        int fact = 1;
        while (a > 0) {
            fact *= a;
            a--;
        }
        System.out.printf("Factorial = %d", fact);
    }
}
