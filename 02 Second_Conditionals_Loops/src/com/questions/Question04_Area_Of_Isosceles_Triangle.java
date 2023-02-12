package com.questions;

import java.util.Scanner;
import java.lang.Math;

public class Question04_Area_Of_Isosceles_Triangle {
    public static void main(String[] args) {
        System.out.println("\nIsosceles Triangle Area Calculator\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of equal side of sides of Triangle: ");
        int equal_side = input.nextInt();
        System.out.print("Enter length of the base of Triangle: ");
        int base = input.nextInt();
        float area = (float) (0.25 * base * Math.sqrt(4 * equal_side * equal_side - base * base));
        System.out.format("Area of Isosceles Triangle is: %.2f", area);
    }
}
