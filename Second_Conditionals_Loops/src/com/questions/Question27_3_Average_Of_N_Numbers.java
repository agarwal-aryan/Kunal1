package com.questions;

import java.util.Scanner;

public class Question27_3_Average_Of_N_Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of times you want to enter Number: ");
        int m = input.nextInt();
        int b = m;
        int sum = 0;
        while (m > 0) {
            System.out.print("Enter Number: ");
            int a = input.nextInt();
            sum += a;
            m--;
        }
        System.out.print("Average is = " + (sum / b));
    }
}
