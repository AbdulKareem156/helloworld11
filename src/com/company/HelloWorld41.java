package com.company;

import java.util.Scanner;

public class HelloWorld41 {
    public static void main(String[] args) {
        //Armstrong number\\
        System.out.println("Enter the number ");
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        double r=0;
        int c=0;
        for(int i=n;i!=0;c++){
            i=i/10;
        }
        for(int i=n;i!=0;i=i/10){
            int rem=i%10;
            r+=Math.pow(rem,c);
        }
        if(n==r){
            System.out.println("Armstrong number");
        }
        else
            System.out.println("not a armstrong number");
    }
}
