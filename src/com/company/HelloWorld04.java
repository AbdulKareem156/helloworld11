package com.company;

import java.util.Scanner;

public class HelloWorld04 {
    public static void main(String[] args) {
        System.out.println("Enter your age ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>55){
            System.out.println("You are overage age ");
        }
        else if (age>18){
            System.out.println("Your at the Correct age");
        }
        else  if (age<18){
            System.out.println("You are underage");
        }
    }
}
