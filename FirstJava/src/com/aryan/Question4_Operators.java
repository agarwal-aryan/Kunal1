package com.aryan;

import java.util.Scanner;

public class Question4_Operators {
    public static void main(String[] args) {
        // Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a = input.nextInt();
        System.out.print("Enter Second Number: ");
        int b = input.nextInt();
        System.out.print("Enter Operator From '+','-','*','/': ");
        String c = input.next();
        if (c.equals("+")) {
            System.out.println(a + b);
        } else if (c.equals("-")) {
            System.out.println(a - b);
        } else if (c.equals("*")) {
            System.out.println(a * b);
        } else if (c.equals("/")) {
            System.out.println(a / b);
        } else {
            System.out.println("Invalid choice");
        }
        /*
 second method
        switch (c) {
            case "+" -> System.out.println(a + b);
            case "-" -> System.out.println(a - b);
            case "*" -> System.out.println(a * b);
            case "/" -> System.out.println(a / b);
            default -> System.out.println("Invalid choice");
        }
*/
    }
}
