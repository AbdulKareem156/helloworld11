package com.company;
 class hell{
    String name;
    hell(){
        this.name="Biggenear's Boook";
    }
        }
 class recursion{
     static  int factorial(int n){
         if(n==1||n==0)
             return 1;
         else
             return n*factorial(n-1);
     }
 }

public class HelloWorld34_oop1 {
    public static void main(String[] args) {
       hell obj=new hell();
        System.out.println(obj.name);
        recursion a =new recursion();
        System.out.println(a);
    }
}
