package com.company;

import java.util.Scanner;

public class HelloWorld02 {
    public static void main(String[] args) {
        System.out.println("Taking the intergers from the youser");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = sc.nextInt();
        System.out.println("Enter number 2");
        int b = sc.nextInt();
        int mult = a*b;
        System.out.println("The multiplication is "+mult);
        System.out.println("Enter number 3");
        int c = sc.nextInt();
        System.out.println("Enter number 4");
        int d = sc.nextInt();
        int sub = c-d;
        System.out.println("The subraction is "+sub);
        int total = mult + sub;
        System.out.println("The total of given youser integer is ");
        System.out.println(total);

    }
}
