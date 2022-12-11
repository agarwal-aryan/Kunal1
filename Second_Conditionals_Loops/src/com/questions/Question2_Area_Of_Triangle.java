package com.questions;

import java.util.Scanner;

public class Question2_Area_Of_Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of base");
        float b = input.nextFloat();
        System.out.print("Enter length of height");
        float h = input.nextFloat();
        System.out.println((b * h) / 2);
    }
}
