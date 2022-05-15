package com.company;
   //constructor
 /*class bike {
    bike(){
        System.out.println("whats up");
    }
}*/
 class student1{
     int id;
     String name;
    int age ;
     student1(int i,String n){
         id=i;
         name=n;
     }
     student1(int i,String n,int o){
         id=i;
         name=n;
         age=o;
     }
     student1(student1 s){
         id =s.id;
         name = s.name;
         age = s.age;
     }
     void display(){
         System.out.println(id+" "+name+" "+age);
     }
     }
public class HelloWorld33_oop {
    public static void main(String[] args) {
  //  bike a=new bike();
       student1 n=new student1(301,"AbdulKareem");
       student1 m=new student1(302,"Abi",40);
       student1 k = new student1(n);
       student1 l = new student1(m);
       n.display();
       m.display();
       k.display();
       l.display();
    }

}
