package com.company;

import java.util.Scanner;

public class HelloWorld10 {
    public static void main(String[] args) {
        System.out.println("Enter the radious of the circle");
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double area = (22*r*r)/7;
        System.out.println("The area of the circle is " +area);
        
    }
}
