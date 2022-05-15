package com.company;
class base1{
    base1(){
        System.out.println("The constructor is a base class");
    }
    base1(int a){
        System.out.println("I am a overloaded Constructor in base class :" +" "+ a);
    }
}
class derived1 extends base1{
    derived1(){
      //  super(56);
        System.out.println("The constructur is a derived class");
    }
    derived1(int a,int b){
        super(a);
        System.out.println("I am a overloaded Constructor in derived class with  b as values :"+" "+b);
    }
}
class childofderived extends derived1{
    childofderived(int a,int b,int c){
        super(a, b);
        System.out.println("I am a child of derived1 with containg z value :" +" "+c);
    }
}
public class HlleoWorld22 {
    public static void main(String[] args) {
       // derived1 ab = new derived1();
      //  derived1 abc = new derived1(100,200);
        childofderived adcd = new childofderived(10,20,30);

    }
}
