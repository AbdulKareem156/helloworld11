package com.company;
interface bycycle{
   //  int a =30;
   // int b =40;
     void applyBrake(int decrement);
     void applySpeed(int increment);
}
interface horn{
    void horn1();
    void horn2();
}

class a1cycle implements bycycle,horn{
    int a = 20;
    public void applyBrake(int decrement) {
         a = a-decrement;
        System.out.println("The speed lowers");
    }


    int b = 20;
    public void applySpeed(int increment) {
        b = b+increment;
        System.out.println("The speed increases");
    }

    @Override
    public void horn1() {
        System.out.println("pe pe pe");
    }

    @Override
    public void horn2() {
        System.out.println("po po po");
    }
}

public class HelloWorld27 {
    public static void main(String[] args) {
        a1cycle A = new a1cycle();
        A.applyBrake(5);
        System.out.println(A.a);
        A.applySpeed(5);
        System.out.println(A.b);

         a1cycle B = new a1cycle();
         B.horn1();
        System.out.println(B);
        B.horn2();
        System.out.println(B);

    }
}
