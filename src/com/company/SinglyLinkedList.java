package com.company;

import java.util.LinkedList;

public class SinglyLinkedList {
    private  ListNode head;
    private static  class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void  display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }
        public int length(){
            if(head == null){
                return 0;
            }
            int count =0;
            ListNode current = head;
            while (current!= null){
                count++;
                current = current.next;
            }
            return count;
        }
        public void insertNode(int value){
        ListNode newNode = new ListNode(value);
        newNode.next=head;
        head=newNode;
        }
    public void  insertLast(int value){
        ListNode newNode = new ListNode(value);
        if(head ==null){
            head =newNode;
            return;
        }
        ListNode current=head;
        while(null!=current.next){
            current =current.next;
        }
        current.next=newNode ;
    }
        //Inserting a value at the given position
        public void Insert(int position,int value) {
            ListNode node = new ListNode(value);
            if (position == 1) {
                node.next = head;
                head = node;
            } else {
                int count = 1;
                ListNode previous = head;
                while (count < position - 1) {
                    previous = previous.next;
                    count++;
                }

                ListNode current = previous.next;
                previous.next = node;
                ;
                node.next = current;
            }
    }
             // delete at the first position
            public ListNode deletefirst(){
             if(head==null){
                 return null;
             }
             ListNode temp=head;
             head=head.next;
             temp.next=null;
             return temp;
            }
            // delete at last position
            public ListNode deletelast(){
        if(head==null||head.next==null){
            return head;
        }
        ListNode current=head;
        ListNode previous=null;
        while(current.next!=null){
            previous=current;
            current=current.next;
        }
        previous.next=null;
        return current;
            }
            //delete at the given position
            public void delete(int position) {
                if (position == 1) {
                    head = head.next;
                } else {
                    ListNode previous = head;
                    int count = 1;
                    while (count < position - 1) {
                        previous = previous.next;
                        count++;
                    }
                    ListNode current = previous.next;
                    previous.next = current.next;
                }
            }
            public boolean searchGivenElement(ListNode head,int searchKey){
        if(head==null){
            return false;
        }
        ListNode current=head;
        while(current!=null){
            if(current.data==searchKey){
                return true;
            }
            current=current.next;
        }
             return false;
            }
    public static ListNode merge(ListNode a, ListNode b){
       ListNode dummy=new ListNode(0);
      ListNode tail=dummy;
        while (a!=null&&b!=null){
            if(a.data<=b.data){
                tail.next=a;
                a=a.next;
            }
            else{
                tail.next=b;
                b=b.next;
            }
            tail=tail.next;
        }
        if(a==null){
            tail.next=b;
        }
        else{
            tail.next=a;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
      //  SinglyLinkedList d = new SinglyLinkedList();

     //   d.head = new ListNode(10);
      /*  ListNode second = new ListNode(1);
        ListNode Third = new ListNode(12);
        ListNode fourth = new ListNode(15);
        d.head.next = second;
        second.next = Third;
        Third.next = fourth;
         //length of the element
         System.out.println("The length of the list is -> "+d.length()); */
         //inserting the element at beginning
        // d.insertNode(1);
        // d.insertNode(2);
        // d.insertNode(3);
        //inserting the element at end
       // d.insertLast(1);
       // d.insertLast(2);
       // d.insertLast(3);
        // d.display();
        //Inserting a value at the given position
    /*    d.Insert(1,10);
        d.Insert(2,11);
        d.Insert(3,12);
        d.Insert(4,13);
        d.Insert(5,14);
        d.Insert(1,9);
        d.Insert(5,2);
        d.Insert(8,1);
        d.Insert(8,2);
        d.display();
     /*   System.out.println(d.deletefirst().data);
        d.display();
        System.out.println(d.deletefirst().data);
        d.display();
        System.out.println(d.deletelast().data);
        d.display();
        d.delete(3);
        d.display();
        d.delete(5);
        d.display();
        d.delete(1);
        d.display();
      */
        ListNode head=new ListNode(2);
        ListNode second=new ListNode(3);
        ListNode three=new ListNode(4);
        ListNode four=new ListNode(5);
        ListNode five=new ListNode(7);
        head.next=second;
        second.next=three;
        three.next=four;
        four.next=five;

       SinglyLinkedList c=new SinglyLinkedList();
       c.display();
           if(c.searchGivenElement(head,11)){
               System.out.println("Search key is found");
           }
           else{
               System.out.println("Search key not found");
           }
        SinglyLinkedList sill1=new SinglyLinkedList();
        sill1.insertLast(1);
        sill1.insertLast(3);
        sill1.insertLast(5);
        sill1.insertLast(7);
       SinglyLinkedList sill2=new SinglyLinkedList();
        sill2.insertLast(2);
        sill2.insertLast(4);
        sill2.insertLast(6);
        sill2.insertLast(8);
        sill1.display();
        sill2.display();
        SinglyLinkedList result =new SinglyLinkedList();
        result.head = merge(sill1.head,sill2.head);
        result.display();

    }
}
