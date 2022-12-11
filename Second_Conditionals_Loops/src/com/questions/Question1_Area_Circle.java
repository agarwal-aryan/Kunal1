package com.questions;

import java.util.Scanner;

public class Question1_Area_Circle {
    //Area Of Circle Java Program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Radius of Circle:-");
        int radius = input.nextInt();
        double area = 3.14 * radius * radius;
        System.out.println(area);
    }
}
