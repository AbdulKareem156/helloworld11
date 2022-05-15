package com.company;

public class HelloWorld36 {
    public static void main(String[] args) {
        int temp =0;
        int sum=0;
        for(int i=1;i<=100;i++){
            for(int j=2;j<=i-1;j++){
                if(i%j==0){
                    temp=temp+1;
                }
            }
            if(temp==0){
                System.out.println(i);
                sum=sum+i;
            }
            else{
                temp=0;
            }
        }
        System.out.println("the sum of first 100 prime number is "+sum);
    }
}
