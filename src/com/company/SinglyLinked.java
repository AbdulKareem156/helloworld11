package com.company;

public class SinglyLinked {
    public listnode head;
    public static class listnode{
        public  int data;
        private listnode next;
        public listnode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void display(listnode head){
        if(head==null){
            return;
        }
        listnode current=head;
        while (current!=null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println(current);
    }
    public boolean searchGivenElement(listnode head, int searchKey){
        if(head==null){
            return false;
        }
        listnode current=head;
        while(current!=null){
            if(current.data==searchKey){
                return true;
            }
            current=current.next;
        }
        return false;
    }
    public listnode reverse(listnode head){
        if(head==null){
            return head;
        }
        listnode current =head;
        listnode previous =null;
        listnode next =null;
        while(current!=null){
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        return previous;
    }
    public listnode midnode(){
        if(head==null){
            return null;
        }
        listnode slowpt=head;
        listnode fastpt=head;
        while(fastpt!=null&&fastpt.next!=null){
            slowpt = slowpt.next;
            fastpt = fastpt.next.next;
        }
        return slowpt;
    }


    public static void main(String[] args) {
        listnode head =new listnode(10);
        listnode sec =new listnode(20);
        listnode three=new listnode(30);
        listnode four = new listnode(40);
        listnode five = new listnode(50);
        head.next=sec;
        sec.next=three;
        three.next=four;
        four.next=five;
        SinglyLinked x=new SinglyLinked();
        System.out.println("list");
        x.display(head);
        System.out.println("Reverse of list");

      listnode reverseListHead=x.reverse(head);
     x.display(reverseListHead);
    listnode middleNode= x.midnode();
        System.out.println("The middle node is -->"+middleNode.data);
    }
}

