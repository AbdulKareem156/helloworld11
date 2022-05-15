package com.company;

import java.util.Random;
import java.util.Scanner;

class game{
    public int number;
    public int inputnumber;
    public int noOfgusses;
    public int getNoOfgusses(){
      return noOfgusses;
    }

    public void setNoOfgusses(int noOfgusses) {
        this.noOfgusses = noOfgusses;
    }
    game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    void takeuserinput(){
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputnumber = sc.nextInt();
    }
    boolean iscorrectnumber() {
        noOfgusses++;
        if (inputnumber == number) {
            System.out.format("Yes you gussed it right " ,number, noOfgusses);
            return true;
        } else if (inputnumber < number) {
            System.out.println("its too low");
        } else if (inputnumber > number) {
            System.out.println("its too high");
        }
        return false;
    }
}

public class HelloWorld25 {
    public static void main(String[] args) {
        game f = new game();
        boolean b=false;
        while (!b){
            f.takeuserinput();
            b = f.iscorrectnumber();
            System.out.println(b);
        }

    }
}
