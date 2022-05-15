package com.company;

import java.util.Scanner;

public class HelloWorld06 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int N;
        System.out.println("Enter the student marks");
        N = keyboard.nextInt();
        if (N<35) {
            System.out.println("Failed");
        }
        else if (N>=60) {
            System.out.println("first class");
        }
        else if (N>=50) {
                    System.out.println("second class");
        }
        else if (N>=35) {
            System.out.println("Third class");
        }

        
    }

}
