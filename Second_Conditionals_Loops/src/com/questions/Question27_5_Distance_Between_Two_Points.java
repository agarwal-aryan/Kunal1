package com.questions;

import java.util.Scanner;

public class Question27_5_Distance_Between_Two_Points {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x1 Coordinate: ");
        int x1 = input.nextInt();
        System.out.print("Enter x2 Coordinate: ");
        int x2 = input.nextInt();
        System.out.print("Enter y1 Coordinate: ");
        int y1 = input.nextInt();
        System.out.print("Enter y2 Coordinate: ");
        int y2 = input.nextInt();
        float dis = (float) Math.sqrt((Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2)));
        System.out.printf("Distance between two points = %.2f", dis);
    }
}
