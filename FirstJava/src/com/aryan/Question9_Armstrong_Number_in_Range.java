package com.aryan;

import java.lang.Math;
import java.util.Scanner;

public class Question9_Armstrong_Number_in_Range {
    public static void main(String[] args) {
        //To find Armstrong Number between two given number.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Starting:-");
        int start = input.nextInt();
        System.out.print("Enter Ending:-");
        int end = input.nextInt();
        for (int i = start; i < end + 1; i++) {
            float sum = 0;
            int num1 = i;
            while (num1 > 0) {
                int rem = num1 % 10;
                sum = (float) (sum + (Math.pow(rem, 3)));
                num1 = num1 / 10;
            }
            if (sum == i) {
                System.out.println(i + " ");
            }
        }
    }
}
