package com.questions;

import java.util.Scanner;

public class Question03_Area_Of_Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Length of the Rectangle: ");
        int a = input.nextInt();
        System.out.print("Enter Breadth of the Rectangle: ");
        int b = input.nextInt();
        int area = a * b;
        System.out.println("Area of Rectangle is: " + area + " unit^2");
    }
}
