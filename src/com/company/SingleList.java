package com.company;

public class SingleList {
     list head;
    private static class list{
        int data;
        list next;
        public  list(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void display(){
        list current=head;
        while (current!=null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println("null");
    }
    public SingleList.list midnode(){
        if(head==null){
            return null;
        }
        SingleList.list slowpt=head;
        SingleList.list fastpt=head;
        while(fastpt!=null&&fastpt.next!=null){
            slowpt = slowpt.next;
            fastpt = fastpt.next.next;
        }
        return slowpt;
    }
         public list getNthNodeFromEnd(int n){
        if(head==null){
            return null;
        }
        if(n<=0){
            throw new IllegalArgumentException("Invalid value"+n);
        }
        list mainptr=head;
        list refptf=head;
        int count=0;
        while(count<n){
            if(refptf==null){
                throw new IllegalArgumentException(n+"is greater than the number of nodes in list");
            }
            refptf=refptf.next;
            count++;
        }
        while (refptf!=null){
            refptf=refptf.next;
            mainptr=mainptr.next;
        }
        return mainptr;
         }
         public void removeDuplicates(){
        if(head==null){
            return ;
        }
        list current=head;
        while(current!=null&&current.next!=null){
            if(current.data==current.next.data) {
                current.next = current.next.next;
            }
            else{
                current=current.next;
            }

        }
    }
    public list insertSortedList(int value){
        list newNode=new list(value);
        if(head==null) {
            return newNode;
        }
      list current=head;
        list temp=null;
        while (current!=null&&current.data<newNode.data){
            temp=current;
            current=current.next;
        }
        temp.next=newNode;
        newNode.next=current;
        return head;
    }
    public list RemoveOfKey(int key) {
        if (head == null) {
            return null;
        }
        list current = head;
        list temp = null;
        while (current != null && current.data != key) {
            temp = current;
            current = current.next;
        }
        if (current == null) {
            return head;
        }
        temp.next = current.next;
        return head;
    }
         public Boolean containsLoop(){
             list fastptr=head;
             list slowptr=head;
             while(fastptr!=null&&fastptr.next!=null){
                 fastptr=fastptr.next.next;
                 slowptr=slowptr.next;
                 if(fastptr==slowptr){
                     return true;
                 }
             }
             return false;
        }
    public list NodeAtTheStartingOfLoop(){
        list fastptr=head;
        list slowptr=head;
        while(fastptr!=null&&fastptr.next!=null){
            fastptr=fastptr.next.next;
            slowptr=slowptr.next;
            if(fastptr==slowptr){
                return StartingPointData(slowptr);
            }
        }
        return null;
    }
      public list StartingPointData(list slowptr){
        list temp=head;
        while (slowptr!=temp){
            temp=temp.next;
            slowptr=slowptr.next;
        }
        return temp;
      }
    public void NodeAtTheStartingLoop(){
        list fastptr=head;
        list slowptr=head;
        while(fastptr!=null&&fastptr.next!=null){
            fastptr=fastptr.next.next;
            slowptr=slowptr.next;
            if(fastptr==slowptr){
                 BrakingLoop(slowptr);
                 return ;
            }
        }
    }
    public void BrakingLoop(list slowptr){
        list temp=head;
        while (slowptr.next!=temp.next){
            temp=temp.next;
            slowptr=slowptr.next;
        }
        slowptr.next=null;
    }

    public void CreateALoopInList(){
        list first = new list(1);
        list sec = new list(2);
        list three = new list(3);
        list four = new list(4);
        list five = new list(5);
        list six = new list(6);
        list seven = new list(7);

         head = first;
         first.next=sec;
         sec.next=three;
         three.next=four;
         four.next=five;
         five.next=six;
         six.next=seven;
         seven.next=four;
    }
    public void  insertLast(int value){
        SingleList.list newNode = new SingleList.list(value);
        if(head ==null){
            head =newNode;
            return;
        }
        SingleList.list current=head;
        while(null!=current.next){
            current =current.next;
        }
        current.next=newNode ;
    }
    public static list merge(list a,list b){
        list dummy=new list(0);
        list tail=dummy;
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
        SingleList sill=new SingleList();
        sill.head=new list(10);
        list sec=new list(11);
        list three =new list(11);
        list four =new list(13);
        list five=new list(13);
        list six=new list(14);
        sill.head.next=sec;
        sec.next=three;
        three.next=four;
        four.next=five;
        five.next=six;
      //  sill.display();
      //  SingleList.list middleNode= sill.midnode();
        //System.out.println("The middle node is -->"+middleNode.data);
       list O= sill.getNthNodeFromEnd(2);
        System.out.println("Nth node from end is ->"+O.data);
        sill.removeDuplicates();
        System.out.println("Removing the duplicates");
        sill.display();
        sill.insertSortedList(12);
        System.out.println("inserting the value in sorted list");
        sill.display();
        sill.RemoveOfKey(12);
        System.out.println("Removing the given key");
            sill.display();
       SingleList s=new SingleList();
        s.CreateALoopInList();
        System.out.println(s.containsLoop());
        System.out.println(s.NodeAtTheStartingOfLoop().data);
        s.NodeAtTheStartingLoop();
        s.display();
        SingleList sill1=new SingleList();
       sill1.insertLast(1);
       sill1.insertLast(3);
       sill1.insertLast(5);
       sill1.insertLast(7);
       SingleList sill2=new SingleList();
       sill2.insertLast(2);
       sill2.insertLast(4);
       sill2.insertLast(6);
       sill2.insertLast(8);
          sill1.display();
          sill2.display();
          SingleList result =new SingleList();
          result.head = merge(sill1.head,sill2.head);
        System.out.print("Merge list is of two lists is -->");
          result.display();

    }
}
