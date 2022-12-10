package com.aryan;

import java.util.Scanner;

public class Question6_Rupee_Dollar_Conversion {
    public static void main(String[] args) {
        //Input currency in rupees and output in USD.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Rupees: ");
        float rupees = input.nextFloat();
        float dollar = (float) (rupees / 81.22);
        System.out.printf("You Have $ %.2f", dollar);
    }
}
