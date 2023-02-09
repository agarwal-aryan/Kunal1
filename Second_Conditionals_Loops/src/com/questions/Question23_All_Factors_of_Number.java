package com.questions;

import java.util.Scanner;

public class Question23_All_Factors_of_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int a = input.nextInt();
        int i = 1;
        while (i < a) {
            if (a % i == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
