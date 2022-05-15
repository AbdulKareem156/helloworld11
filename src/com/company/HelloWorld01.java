package com.company;
import java.util.Scanner;
public class HelloWorld01 {
    public static void main(String[] args) {
        System.out.println("Taking the value from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = sc.nextInt();
        System.out.println("Enter number 2");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("sum of these number is");
        System.out.println(sum);
    }
}
