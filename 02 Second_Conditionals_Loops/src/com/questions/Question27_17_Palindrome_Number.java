package com.questions;

import java.util.Scanner;

public class Question27_17_Palindrome_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int number = input.nextInt();
        int sum = 0, b, a = number;
        while (number > 0) {
            b = number % 10;
            sum = (sum * 10) + b;
            number /= 10;
        }
        if (sum == a) {
            System.out.printf("%d is Palindrome", sum);
        } else {
            System.out.printf("%d is not a Palindrome", sum);
        }
    }
}
