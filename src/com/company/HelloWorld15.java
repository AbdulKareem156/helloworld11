package com.company;

public class HelloWorld15 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        int l = a.length;
        int n = Math.floorDiv(l,2);
        int temp;
        for(int i=0;i<n;i++){
            temp = a[i];
            a[i] =a[l-1-i];
            a[l-i-1] = temp;
        }
        for(int element:a){
            System.out.print(element + " ");
        }
    }
}
