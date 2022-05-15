package com.company;
class student{
    int id;
    String name;
    String branch;
    String programmer;
}

public class HelloWorld17 {
    public static void main(String[] args) {
        System.out.println("Our  class");
        student kareem = new student();
        kareem.id = 301;
        kareem.name = "AbdulKareem";
        kareem.branch = "Mechanichal";
        kareem.programmer = "Android Developer";
        System.out.println(kareem.id);
        System.out.println(kareem.name);
        System.out.println(kareem.branch);
        System.out.println(kareem.programmer);
        
    }
}
