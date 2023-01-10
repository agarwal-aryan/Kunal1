package com.questions;

import java.util.Scanner;

public class Question13_Perimeter_Of_Rhombus{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the length of side of Rhombus: ");
        int side= input.nextInt();
        System.out.println("Perimeter of Rhombus ="+4*side+"cm");
    }
}
