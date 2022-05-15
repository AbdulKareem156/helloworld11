package com.company;
import java.util.Date;
class Balanc {
    String n;
    double b;

    Balanc(String n, double b) {
        this.n = n;
        this.b = b;
    }


    void Show() {
        if (b < 0) {
            System.out.println("Account is dead");
        } else
            System.out.println(n + " : $ " + b);
    }

}
public class Balance {
    public static void main(String[] args) {
        Balanc current[] = new Balanc[3];
    current[0]=new Balanc("Abdul",123);
    current[1] = new Balanc("Kareem",233);
    current[2]= new Balanc("Md",333);
    for (int i=0;i<3;i++){
        current[i].Show();
    }
    Date today = new Date();
        System.out.println(today);
    }
}
