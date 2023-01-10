package com.questions;

import java.util.Scanner;

public class Question12_Perimeter_Of_Square {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the side length of Square: ");
        int side=input.nextInt();
        System.out.println("Perimeter of Square = "+(4*side)+"cm");
    }
}
