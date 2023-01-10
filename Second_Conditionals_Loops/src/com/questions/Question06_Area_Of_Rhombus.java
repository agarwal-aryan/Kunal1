package com.questions;

import java.util.Scanner;

public class Question06_Area_Of_Rhombus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the diagonal 1 of Rhombus: ");
        float p = input.nextInt();
        System.out.print("Enter the diagonal 2 of Rhombus: ");
        float q = input.nextInt();
        float area = (p * q) / 2;
        System.out.println("Area of parallelogram is " + area);
    }
}
