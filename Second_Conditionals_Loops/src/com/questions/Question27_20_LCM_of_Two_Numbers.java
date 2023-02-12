package com.questions;

import java.util.Scanner;

public class Question27_20_LCM_of_Two_Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        int num1 = input.nextInt();
        System.out.print("Enter Number 2: ");
        int num2 = input.nextInt();
        int a;
        int i = 1;
        while (true) {
            if (i % num1 == 0 && i % num2 == 0) {
                a = i;
                break;
            }
            i++;
        }
        System.out.printf("LCM of %d and %d = %d", num1, num2, a);
    }
}
