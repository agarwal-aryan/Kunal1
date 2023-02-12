package com.questions;

import java.util.Scanner;

public class Question26_Addition_Of_Two_Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first Number: ");
        int a = input.nextInt();
        System.out.print("Enter second Number: ");
        int b = input.nextInt();
        System.out.printf("Sum = %d", a + b);

    }
}
