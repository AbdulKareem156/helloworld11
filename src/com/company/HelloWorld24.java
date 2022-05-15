package com.company;
class phone{
    public void greet(){
        System.out.println("good morning");
    }
    public void switchon(){
        System.out.println("Turning on the phone");
    }
}
class smartphone extends phone{
public void Assalamualikum(){
    System.out.println("(Assalamualikum) peace be on you");
}
     public void switchon(){
    System.out.println("Turning on the Smartphone");
}
}

public class HelloWorld24 {
    public static void main(String[] args) {
        smartphone b = new smartphone();
        b.Assalamualikum();
        phone a = new smartphone(); //right way
        a.switchon();
      //  smartphone c = new  phone(); (inapropriate way)not allowed

    }
}
