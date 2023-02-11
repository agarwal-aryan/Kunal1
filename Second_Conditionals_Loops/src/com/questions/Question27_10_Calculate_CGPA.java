package com.questions;

import java.util.Scanner;

public class Question27_10_Calculate_CGPA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number of Subjects: ");
        int num = input.nextInt();
        float sum = 0, cgpa;
        for (int i = 0; i < num; i++) {
            System.out.print("Enter CGPA of each subject: ");
            cgpa = input.nextFloat();
            sum += cgpa;
        }
        float cpga1 = (float) ((sum / num) * 9.5);
        System.out.printf("CGPA of Student is: %.2f", cpga1);
    }
}
