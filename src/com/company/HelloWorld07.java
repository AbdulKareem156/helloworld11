package com.company;

import java.util.Scanner;

public class HelloWorld07 {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = op.nextInt();
        System.out.println("Enter the second number");
        int b = op.nextInt();
        if (a>b) {
            System.out.println("The first number is greater than the second number "+a);
        }
        else if (a<b) {
            System.out.println("The second number is greater than the first number "+b);

        }
    }
}
