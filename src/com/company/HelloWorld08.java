package com.company;

import java.util.Scanner;

public class HelloWorld08 {
    public static void main(String[] args) {
        System.out.println("Printing the reverse of the number");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
      int k = n%10; //gets the last digits of number
      int a = n/10; //converts the three digit to too digit
      int b = a%10;
      int reverse = k*10+b;
      int c = a/10;
      int reverse1 = reverse*10+c;
        System.out.println("The reverse of the number is ");
        System.out.println(reverse1);
        System.out.println("first own program");


    }
}
