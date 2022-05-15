package com.company;

import java.util.NoSuchElementException;

public class DoubleLinkedList {
    private ListNode head;
    private ListNode tail;
    private int Length;
    public class ListNode{
        private int data;
        private ListNode next;
        private ListNode previous;

     public ListNode(int data){
            this.data=data;

        }
    }
    public DoubleLinkedList(){
        this.head=null;
        this.tail=null;
        this.Length=0;
    }
    public boolean Empty(){
        return Length==0;
    }
    public  int Length(){
        return Length;
    }
    public void insertLast(int value){
        ListNode x =new ListNode(value);
        if(Empty()){
            head= x;
        }
        else{
            tail.next=x;
        }
         x.previous=tail;
        tail=x;
        Length++;

    }
    public void DisplayForward(){
        if(head==null){
            return;
        }
        ListNode temp=head;
        while (temp!=null){
            System.out.print(temp.data +"-->");
            temp =temp.next;
        }
        System.out.println("Null");
    }
    public  void DisplayLast(){
        if(head==null){
            return;
        }
        ListNode temp=tail;
        while (temp!=null){
            System.out.print(temp.data+"<--");
            temp =temp.previous;
        }
        System.out.print("Null");
    }
    public void InsertAttheBigning(int value){
        ListNode newNode = new ListNode(value);
        if(Empty()){
            tail=newNode;

        }
        else {
            head.previous=newNode;
        }
        newNode.next=head;
        head=newNode;
        Length++;
    }
    public void InsertAtLast(int value){
        ListNode newNode = new ListNode(value);
        if(Empty()){
            head=newNode;
        }
        else {
          tail.next=newNode;
          newNode.previous=tail;
        }
        tail=newNode;
        Length++;
    }
    public  ListNode DeleteFirst(){
        if(Empty()){
            throw new NoSuchElementException();

        }
        ListNode temp = head;

        if (head==tail){
            tail=null;
        }
        else {
            head.next.previous=null;
        }
        head.next = head;
        temp.next=null;
        Length--;
        return temp;
    }
    public  ListNode DeleteLast(){
        if(Empty()){
            throw new NoSuchElementException();

        }
        ListNode temp = tail;

        if (head==tail){
            head=null;
        }
        else {
            tail.previous.next=null;
        }
        tail.previous=tail;
        temp.next=null;
        Length--;
        return temp;
    }


    public static void main(String[] args) {
        DoubleLinkedList s =new DoubleLinkedList();
      //s.InsertAttheBigning(12);
      // s.InsertAttheBigning(15);
      // s.InsertAtLast(13);
       //s.InsertAtLast(14);
       //s.DisplayForward();
       //s.DisplayLast();
        s.InsertAtLast(10);
        s.InsertAtLast(11);
        s.InsertAtLast(12);
        s.InsertAtLast(13);
        s.DeleteFirst();
    // s.DeleteLast();
        s.DisplayForward();

    }
}
