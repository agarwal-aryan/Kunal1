package com.questions;

import java.util.Scanner;

public class Question27_16_Reverse_the_String {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string to reverse: ");
        String s = input.next();
        int len = s.length();
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            s1 = a + s1;
        }
        System.out.print(s1);
    }
}
