package com.questions;

import java.util.Scanner;

public class Question30_1_Discount_on_Product {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter MRP of the Product: ");
        float mrp = input.nextFloat();
        System.out.print("Enter Discount percentage: ");
        float dis = input.nextFloat();
        System.out.printf("Discount amount is= %.2f ", ((dis * mrp) / 100));
    }
}
