package com.questions;

import java.util.Scanner;

public class Question18_Volume_Of_Pyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base length of Pyramid: ");
        float length = input.nextFloat();
        System.out.print("Enter base width of Pyramid: ");
        float width = input.nextFloat();
        System.out.print("Enter height of Pyramid: ");
        float height = input.nextFloat();
        double volume = 0.334 * length * width * height;
        System.out.printf("Volume of Pyramid= %.2f", volume);

    }
}
