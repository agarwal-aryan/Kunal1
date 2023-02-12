package com.questions;

import java.util.Scanner;

public class Question07_Area_Of_Equilateral_Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side of equilateral triangle: ");
        int a = input.nextInt();
        double area = (0.433 * a * a);
        System.out.println("Area of Equilateral Triangle: " + area);
    }
}
