package com.aryan;

import java.util.Scanner;

public class Question8_PalindromeString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter String To Check: ");
        String str = input.next();
        StringBuilder rev = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            rev.append(str.charAt(i));
        }
        if (str.equals(rev.toString())) {
            System.out.println("Palindrome String");
        } else {
            System.out.println("Not Palindrome String");
        }
    }
}
