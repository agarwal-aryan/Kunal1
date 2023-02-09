package com.questions;

import java.util.Scanner;

public class Question24_Sum_all_numbers_until_0 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, sum = 0;
        do {
            System.out.print("Enter Number: ");
            n = input.nextInt();
            sum += n;
        } while (n != 0);
        System.out.printf("Sum of numbers is: %d", sum);

    }
}
