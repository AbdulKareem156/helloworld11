package com.company;

import javax.swing.*;
import java.util.Scanner;

public class HelloWorld40 {
    public static void main(String[] args) {
        System.out.println("Enter the number ");
        Scanner a = new Scanner(System.in);
        int temp = 0;
        int n = a.nextInt();
        for (int i = 2; i<=n-1; i++) {
            if (n % i == 0) {
                temp = temp + 1;
            }
        }
        if (temp==0&&n!=1) {
            System.out.println(n + " is prime number ");
        }
        else {
            System.out.println(n + " is not prime number");
        }
    }
}
