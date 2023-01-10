package com.questions;

import java.util.Scanner;

public class Question14_Volume_Of_Cone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the height of Cone: ");
        int height = input.nextInt();
        System.out.print("Enter the radius of the Base of Cone: ");
        int radius = input.nextInt();
        double volume = 0.3333 * height * 3.14 * radius * radius;
        System.out.println("Volume of Cone =" + volume + "cm^3");
    }
}
