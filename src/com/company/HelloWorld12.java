package com.company;

import java.util.Scanner;

public class HelloWorld12 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int row,i,j;
        System.out.println("Enter the number of rows");
        row = s1.nextInt();
        System.out.println();
        for(i=0;i<row;i++){
            for(j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
