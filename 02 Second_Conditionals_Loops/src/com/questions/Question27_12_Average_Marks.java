package com.questions;

import java.util.Scanner;

public class Question27_12_Average_Marks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number of Subjects: ");
        int sub = input.nextInt();
        int sum = 0;
        for (int i = 1; i < sub + 1; i++) {
            System.out.printf("Enter Marks in the Subject %d = ", i);
            int a = input.nextInt();
            sum += a;
        }
        float avg = (float) sum / sub;
        System.out.printf("Average of Marks = %.2f", avg);
    }
}
