package com.questions;

import java.util.Scanner;

public class Question27_24_Sum_of_Digits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = input.nextInt();
        int sum = 0, b;
        while (num > 0) {
            b = num % 10;
            sum = sum + b;
            num = num / 10;
        }
        System.out.printf("Sum of the Digits = %d", sum);
    }
}
