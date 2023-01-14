package com.questions;

import java.util.Scanner;

public class Question15_Volume_Of_Prism{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of the prism: ");
        float length= input.nextFloat();
        System.out.print("Enter base edge of the prism: ");
        float base_edge= input.nextFloat();
        System.out.print("Enter height of the prism: ");
        float height= input.nextFloat();
        double volume=0.5*length*base_edge*height;
        System.out.println("Volume of the Prism= "+volume);
    }
}
