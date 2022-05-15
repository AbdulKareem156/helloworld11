package com.company;

import javax.swing.event.ListDataEvent;
import java.lang.reflect.Field;

public class CircularLinkedList {
    private ListNode last;
    private int length;

    public class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;

        }
    }

    public CircularLinkedList() {
        last = null;
        length = 0;
    }

    public int length() {
        return length;
    }

    public Boolean Empty() {
        return length == 0;
    }

    public void createCircularLinkedList() {
        ListNode First = new ListNode(1);
        ListNode Second = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode Four = new ListNode(4);
        First.next = Second;
        Second.next = three;
        three.next = Four;
        Four.next = First;
        last = Four;
    }

    public void Display() {
        if (last == null) {
            return;
        }
        ListNode First = last.next;

        while (First != last) {
            System.out.print(First.data + " ");
            First = First.next;
        }
        System.out.println(First.data);
    }
    public void  InsertFirst(int data){
        ListNode temp = new ListNode(data);
        if(last==null){
            last=temp;

        }
        else {
            temp.next=last.next;
        }
        last.next=temp;
        length++;
    }
    public void InsertLast(int data){
        ListNode temp =new ListNode(data);
        if(last==null){
            last=temp;
            last.next=last;
        }
        else{
            temp.next=last.next;
            last.next=temp;
            last=temp;
        }

        length++;
    }

    public static void main(String[] args) {
        CircularLinkedList s = new CircularLinkedList();
     //   s.createCircularLinkedList();
    //   s.InsertFirst(10);
    //   s.InsertFirst(11);
    //   s.InsertFirst(12);
        s.InsertLast(22);
        s.InsertLast(33);
        s.InsertLast(44);
        s.Display();
    }
}
