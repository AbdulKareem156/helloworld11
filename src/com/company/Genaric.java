package com.company;
class Gen<t1>{
    int val ;
    t1 d;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public t1 getD() {
        return d;
    }

    public void setD(t1 d) {
        this.d = d;
    }

    public Gen(int val, t1 d){
        this.val=val;
        this.d=d;
    }
}

public class Genaric {
    public static void main(String[] args) {
       Gen<String> obj = new Gen(44,"GFood");
        String str = obj.getD();
      //  String srr = obj.setD();
        System.out.println(str);
       // System.out.println(srr);
   }
}
