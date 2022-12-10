package com.aryan;

import java.util.Scanner;

public class Question7_Fibonacci_Series {
    public static void main(String[] args) {
        //To calculate Fibonacci Series up to n numbers.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Limit");
        int limit = input.nextInt();
        int a = 0;
        int b = 1;
        int c;
        System.out.print(a + " ");
        System.out.print(b + " ");
        while (limit - 2 > 0) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
            limit--;
        }
    }
}
