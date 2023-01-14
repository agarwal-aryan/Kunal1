package com.questions;

import java.util.Scanner;

public class Question17_Volume_Of_Sphere {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of Sphere: ");
        float radius = input.nextFloat();
        double volume = 1.334 * 3.1428 * Math.pow(radius, 3);
        System.out.printf("Volume of Sphere is =%.2f", volume);
    }
}
