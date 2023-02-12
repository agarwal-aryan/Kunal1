package com.questions;

import java.util.Scanner;

public class Question27_21_Vowel_or_Consonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Character: ");
        char a = input.next().charAt(0);
        if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' || a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U') {
            System.out.printf("%c is Vowel", a);
        } else {
            System.out.printf("%c is not Vowel", a);
        }
    }
}
