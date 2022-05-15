package com.company;
class base {
    int x;
    String kareem;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("Enter the age X");
        this.x = x;
    }

   // public void printme(){
     //   System.out.println("I am a constructer");
    public String getKareem(){
        return kareem;
    }
    public void setKareem(String kareem){
        System.out.println("Enter the name");
        this.kareem = kareem;
    }
}
class derived extends base{
        int y;

public int getY() {
        return y;
        }

public void setY(int y) {
    System.out.println("Enter the age  Y");
        this.y = y;
        }
        }
public class HelloWorld21 {
    public static void main(String[] args) {
        //base class
       base d = new base();
        d.setX(0);
     //   System.out.println(d.getX());

        //derived class acss base class(useing the extends funtion)
        derived b = new derived();
        b.setX(2);
        System.out.println(b.getX());

        //derived class acess
        derived c = new derived();
        c.setY(0);
        System.out.println(c.getY());
        System.out.println(b.getX()+c.getY());

        //String in clas base
        base e = new base();
        e.setKareem("Abdul Kareem");
        System.out.println(e.getKareem());

    }
}

