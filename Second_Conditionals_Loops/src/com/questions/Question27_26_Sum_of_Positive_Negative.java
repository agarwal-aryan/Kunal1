package com.questions;

import java.util.Scanner;

public class Question27_26_Sum_of_Positive_Negative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sumep = 0, sumn = 0, sumop = 0;
        while (true) {
            System.out.print("Enter Number: ");
            int b = input.nextInt();
            if (b != 0) { //to check entered number zero or not
                if (b < 0) { //to check entered number positive or not
                    sumn += b; //if negative
                } else {// if positive
                    if (b % 2 == 0) { //it is even
                        sumep += b;
                    } else { //if it is odd
                        sumop += b;
                    }
                }
            } else {
                break;
            }
        }
        System.out.printf("Sum of Negative Numbers = %d\n", sumn);
        System.out.printf("Sum of Even Positive Numbers = %d\n", sumep);
        System.out.printf("Sum of Odd Positive Numbers = %d\n", sumop);
    }
}
