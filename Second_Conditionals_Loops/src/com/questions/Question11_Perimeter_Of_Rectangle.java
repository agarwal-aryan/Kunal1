package com.questions;

import java.util.Scanner;

public class Question11_Perimeter_Of_Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of Rectangle: ");
        int length = input.nextInt();
        System.out.print("Enter breadth of Rectangle: ");
        int breadth = input.nextInt();
        System.out.println("Perimeter of Rectangle =" + (2 * (length + breadth)));
    }
}
