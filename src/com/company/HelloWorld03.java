package com.company;

import java.util.Scanner;

public class HelloWorld03 {
    public static void main(String[] args) {
        System.out.println("Taking the data from the youser");
        Scanner sc = new Scanner(System.in);
       int  key = sc.nextInt();
        switch (key){
            case 190:
                System.out.println("The key value  is incorrect");
                break;

            case 180:
                    System.out.println("The key value is incorrect");
                    break;

            case 200:
                        System.out.println("Value is Correct ");
                        break;

            default:
                System.out.println("not from the key value");
                break;
        }
    }


}
