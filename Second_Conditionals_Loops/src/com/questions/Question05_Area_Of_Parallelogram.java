package com.questions;

import java.util.Scanner;

public class Question05_Area_Of_Parallelogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the height of parallelogram: ");
        int h = input.nextInt();
        System.out.print("Enter the base length of parallelogram: ");
        int b = input.nextInt();
        double area = h * b;
        System.out.println("Area of parallelogram is " + area);
    }
}
