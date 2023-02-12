package com.questions;

import java.util.Scanner;

public class Question27_14_Check_Armstrong_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number to be checked: ");
        int num = input.nextInt();
        int o = num;
        int a, sum = 0;
        while (num > 0) {
            a = num % 10;
            sum += (Math.pow(a, 3));
            num = num / 10;
        }
        if (sum == o)
            System.out.printf("%d is an Armstrong Number", o);
        else
            System.out.printf("%d is not an Armstrong Number", o);
    }
}
