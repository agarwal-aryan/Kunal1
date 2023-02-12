package com.questions;

import java.util.Scanner;

public class Question16_Volume_Of_Cylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of base of Cylinder: ");
        float radius = input.nextFloat();
        System.out.print("Enter the height of base of Cylinder: ");
        float height = input.nextFloat();
        double volume = 3.1428 * radius * radius * height;
        System.out.printf("Volume of Cylinder is :%.2f",volume);
    }
}
