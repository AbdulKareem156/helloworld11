package com.company;

public class MergeSort {
    public static void main(String[] args) {
        //Merge two Sorted arrays
     int[] ar={1,3,5,7,9};
     int[] arr={2,4,6};
     int n=ar.length;
     int m=arr.length;
     int i=0,j=0,k=0;
        int[] result=new int[n+m];
     while(i<n&&j<m){
         if(ar[i]<arr[j]) {
             result[k] = ar[i];
             i++;
         }
             else{
                 result[k]=arr[j];
                 j++;
             }
         k++;
     }
  /*   while(i<n){
         result[k]=ar[i];
         i++;
         k++;
     }

   */
     while(j<m){
         result[k]=arr[j];
         j++;
         k++;
     }
     for(k=0;k<n+m;k++){
         System.out.print(result[k]+" ");
     }
    }
}
