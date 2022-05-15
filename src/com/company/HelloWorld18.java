package com.company;
 class Engineer{
     int Salary;
    private String name;
      public int getSalary(){

          return Salary;
     }
     public String getName(){
          return  name;
     }
     public void setName(String n){
          name  = n;
     }
     public  void setSalary(int a){
          Salary = a;
     }
 }

public class HelloWorld18 {
    public static void main(String[] args) {
        Engineer kareem = new Engineer();
        kareem.setName("AbdulKareem");
        System.out.println(kareem.getName());
        kareem.Salary = 79;
        System.out.println(kareem.getSalary());
        kareem.setSalary(85);
        System.out.println(kareem.getSalary());
    }
}
