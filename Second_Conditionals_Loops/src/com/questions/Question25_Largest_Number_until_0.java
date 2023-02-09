package com.questions;

import java.util.Scanner;

public class Question25_Largest_Number_until_0 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, large = 0;
        do {
            System.out.print("Enter Number: ");
            n = input.nextInt();
            if (large < n) {
                large = n;
            }
        } while (n != 0);
        System.out.printf("Largest number is: %d", large);

    }
}
