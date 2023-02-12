package com.questions;

import java.util.Scanner;

public class Question27_23_Leap_Year_or_Not {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Year : ");
        int year = input.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.printf("%d is a Leap Year", year);
        } else {
            System.out.printf("%d is not a Leap Year", year);
        }

    }
}
