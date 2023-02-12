package com.questions;

import java.util.Scanner;

public class Question27_18_Future_Investment_Value {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Present Value: ");
        int pv = input.nextInt();
        System.out.print("Enter rate: ");
        float r = input.nextFloat() / 100;
        System.out.print("Enter time: ");
        int t = input.nextInt();
        float in = (float) (pv * (Math.pow((1 + r), t)));
        System.out.printf("Future Investment Value: %.2f", in);
    }
}
