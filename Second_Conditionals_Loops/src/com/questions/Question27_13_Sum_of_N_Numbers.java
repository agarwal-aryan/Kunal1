package com.questions;

import java.util.Scanner;

public class Question27_13_Sum_of_N_Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number of Subjects: ");
        int sub = input.nextInt();
        int sum = 0;
        for (int i = 1; i < sub+1; i++) {
            System.out.printf("Enter Number %d = ", i);
            int a = input.nextInt();
            sum += a;
        }
        System.out.printf("Average of Marks = %d", sum);
    }
}
