package com.company;

public class HelloWorld32_realnumPattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("5");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1, k = 1; i < n; i++, k++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k);
            }
            System.out.println();
        }
        for (int i = 1, k = 5; i <= n; i++, k--) {
            for (int j = i; j <= n; j++) {
                System.out.print(k);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1, k = 0; i <= n; i++, k += 2) {
            for (int j = i; j <= n; j++) {
                System.out.print(k);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1, k = 1; i <= n; i++, k++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 0) {
                    System.out.print("A");
                } else {
                    System.out.print("B");
                }
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= n; i++) {
            int p = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(p++ + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            int p = 5;
            for (int j = i; j <= n; j++) {
                System.out.print(p--);
            }
            System.out.println();
        }
    }
}