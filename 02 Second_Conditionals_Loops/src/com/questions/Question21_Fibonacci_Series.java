package com.questions;

import java.util.Scanner;

public class Question21_Fibonacci_Series {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0, b = 1;
        System.out.print("Enter the amount of Fibonacci Numbers you want: ");
        int limit = input.nextInt();
        System.out.print(a + " " + b + " ");
        for (int i = 0; i < limit - 2; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
