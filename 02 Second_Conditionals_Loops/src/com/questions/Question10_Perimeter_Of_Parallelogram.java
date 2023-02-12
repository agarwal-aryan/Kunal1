package com.questions;

import java.util.Scanner;

public class Question10_Perimeter_Of_Parallelogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of Parallelogram: ");
        int length = input.nextInt();
        System.out.print("Enter breadth of Parallelogram: ");
        int breadth = input.nextInt();
        System.out.println("Perimeter of Parallelogram =" + (2 * (length + breadth)));

    }
}
