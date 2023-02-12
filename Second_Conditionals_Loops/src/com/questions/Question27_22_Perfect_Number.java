package com.questions;

import java.util.Scanner;

public class Question27_22_Perfect_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int a = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= a / 2; i++) {
            if (a % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == a) {
            System.out.printf("%d is a Perfect Number", sum);
        } else {
            System.out.printf("%d is not a Perfect Number", sum);
        }

    }
}
