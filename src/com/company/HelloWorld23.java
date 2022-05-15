package com.company;
class A{
   public int a;
   public int kareem(){
       return 4;
   }
   public void method1(){
       System.out.println("This is a method1 of class A");
   }
}
class B extends A{
    public void method2(int a){
        System.out.println("This is a method2 of class B :"+a);
    }
    @Override
    public void method1(){
        System.out.println("This is a method1 of class B");
    }
}

public class HelloWorld23 {
    public static void main(String[] args) {
        A we = new A();
        we.method1();
        B s = new B();
        s.method1();
     //   B er = new B();
        s.method2(20);

    }
}
