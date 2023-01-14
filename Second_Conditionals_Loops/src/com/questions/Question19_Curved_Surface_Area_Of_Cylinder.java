package com.questions;

import java.util.Scanner;

public class Question19_Curved_Surface_Area_Of_Cylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float pi = 3.1428F;
        System.out.print("Enter the radius of Cylinder: ");
        float radius = input.nextFloat();
        System.out.print("Enter the height of Cylinder: ");
        float height = input.nextFloat();
        double c_area = 2 * pi * radius * height;
        System.out.printf("Curved Surface Area of Cylinder =%.2f", c_area);
    }
}
