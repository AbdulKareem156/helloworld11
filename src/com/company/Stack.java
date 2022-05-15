package com.company;

import java.util.EmptyStackException;

public class Stack {
    public  Listnode top;
    public int length;

    public class Listnode{
        public Listnode next;
        public  int data;
        public Listnode(int data){
            this.data=data;
        }
    }
    public Stack(){
        length=0;
        top=null;
    }
    public int length(){
        return length;
    }
    public  boolean Emty(){
        return length==0;
    }
    public void push(int data){
        Listnode temp = new Listnode(data);
        temp.next=top;
        top=temp;
        length++;
    }
    public int pop(){
        if(Emty()){
            throw new EmptyStackException();
        }
        int result = top.data;
        top=top.next;
        length--;
        return result;
    }
    public int peek(){
        if(Emty()) {
            throw new EmptyStackException();
        }
        return top.data;
    }
public void display(){
    System.out.println(pop());
}
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.display();
    }

}
