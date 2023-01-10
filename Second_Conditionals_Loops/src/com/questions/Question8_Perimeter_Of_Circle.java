package com.questions;

import java.util.Scanner;

public class Question8_Perimeter_Of_Circle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Radius of the Circle: ");
        float radius= input.nextFloat();
        float PI= (float) 3.14159;
        float perimeter=2*PI*radius;
        System.out.format("Perimeter of Circle = %.2f",perimeter);
    }
}
