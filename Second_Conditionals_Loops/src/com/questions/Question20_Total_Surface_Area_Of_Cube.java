package com.questions;

import java.util.Scanner;

public class Question20_Total_Surface_Area_Of_Cube {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side length of Cube: ");
        float side = input.nextFloat();
        double S_Area = 6 * side * side;
        System.out.println("Total Surface Area of Cube= " + S_Area);
    }
}
