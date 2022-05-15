package com.company;

public class HelloWorld16 {
    static int kareem1(int x,int ...arr) {
    int result=x;
    for(int element:arr) {
        result +=element;
        }
   return result;
    }
        public static void main (String[]args){

            System.out.println("The sum of number is " + kareem1(10,20,30,40,900));
        }
    }
