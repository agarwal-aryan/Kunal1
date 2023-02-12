package com.questions;

import java.util.Scanner;

public class Question22_Subtract_Product_Sum_of_Digits_of_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt();
        System.out.print(subtractProductAndSum(n));
    }

    public static int subtractProductAndSum(int n) {
        int sum = 0, pro = 1;
        while (n > 0) {
            int a = n % 10;
            sum = sum + a;
            pro = pro * a;
            n /= 10;
        }
        return (pro - sum);
    }
}
