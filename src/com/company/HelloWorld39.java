package com.company;

import java.util.Scanner;

public class HelloWorld39 {
    public static void main(String[] args) {
//perfect number\\
        Scanner c=new Scanner(System.in);
        System.out.println("Enter the given number ");
        int n = c.nextInt();
        int sum = 1;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == n) {
            System.out.println(n+" is a perfect number");

        }
        else
            System.out.println(n+" is not a perfect number");
    }
}