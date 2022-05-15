package com.company;
class myin{
    int id ;
    String name;
     myin(int myid,String myname){
        id = myid;
        name = myname;
    }
    public String getName(){ return name; }
    public int getId(){ return id; }

}
public class HelloWorld20 {
    public static void main(String[] args) {
        myin AbdulKareem = new myin(34,"Abdul_");
        System.out.println(AbdulKareem.getId());
        System.out.println(AbdulKareem.getName());


    }
}
