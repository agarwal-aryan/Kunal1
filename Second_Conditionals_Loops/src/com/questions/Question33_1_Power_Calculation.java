package com.questions;

import java.util.Scanner;

public class Question33_1_Power_Calculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = input.nextInt();
        System.out.print("Enter Power to be calculated: ");
        int pow = input.nextInt();
        int pro = 1;
        while (pow > 0) {
            pro *= num;
            pow--;
        }
        System.out.printf("Answer = %d", pro);
    }
}
