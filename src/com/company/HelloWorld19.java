package com.company;

import org.w3c.dom.css.Rect;

class Rectangle{

    int length;
    int breath;
    public int Area(){
        return length*breath;
    }
    public int parameter(){
        return 2*length+2*breath;
    }
}

public class HelloWorld19 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
            rect.length = 5;
            rect.breath = 3;
        System.out.println(rect.Area());
        System.out.println(rect.parameter());


    }
}
