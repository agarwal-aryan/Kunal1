package com.questions;

import java.util.Scanner;

public class Question27_9_Calculate_Batting_Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Run Score: ");
        int run = input.nextInt();
        System.out.print("Enter number of innings played: ");
        int inn = input.nextInt();
        System.out.print("Enter number of innings remained not out: ");
        int nout = input.nextInt();
        float avg = (float) run / (inn - nout);
        System.out.printf("Average of batsman is %.2f", avg);


    }
}
