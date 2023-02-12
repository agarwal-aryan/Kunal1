package com.questions;

import java.util.Scanner;

public class Question09_Perimeter_Of_Equilateral_Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side of Triangle: ");
        int side = input.nextInt();
        int perimeter = 3 * side;
        System.out.println("Perimeter of Triangle is: " + perimeter + "cm");
    }
}
