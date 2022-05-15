package com.company;
abstract class parent{
    public parent(){
        System.out.println("hi im a constructor");
    }
    public void sayhello(){
        System.out.println("hello");
    }
    abstract public void greet1();
    abstract public void greet2();
}
class child1 extends parent{
    @Override
    public void greet1(){
        System.out.println("good morning");
    }

    @Override
    public void greet2() {
        System.out.println("good evening");
    }
}
abstract class child2 extends parent{
    public void yo(){
        System.out.println("very good morning");
    }
}

public class HelloWorld26 {
    public static void main(String[] args) {
     //   parent r = new parent(); { throws an error
     //   child2 d  = new child();  { throws an error
        child1 g = new child1();
        g.greet1();
        g.greet2();
    }

}
