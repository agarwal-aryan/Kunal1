package com.questions;

import java.util.Scanner;

public class Question34_1_Calculate_Depreciation_of_Value {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the original Cost of the Product: ");
        float v1 = input.nextFloat();
        System.out.print("Enter the Rate: ");
        float r = input.nextFloat();
        System.out.print("Enter Time: ");
        float t = input.nextFloat();
        float v2= (float) (v1*(Math.pow(1-(r/100),t)));
        System.out.printf("Depreciation of Value of the Product: %.2f",v2);
    }
}
