package com.company;

public class Sorting {
    public static void main(String[] args) {
       //Insertion Sort
        int[] arr={23,45,24,65,12,2,1,10,0};
        int n = arr.length;
        for(int i=1;i<n;i++){
            int j=i-1;
            int key =arr[i];
            while(j>=0&&(arr[j]>key)){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        System.out.println("Insertion Sort");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //Bubble Sort

        int[] arr1={5,4,6,8,3,2,9,1};
        int N= arr1.length;
        boolean isSwapped;
        for(int i=0;i<N-1;i++){
             isSwapped=false;
            for(int j=0;j<N-1-i;j++){
                if(arr1[j]>arr1[j+1]){
                int temp=arr1[j];
                arr1[j]=arr1[j+1];
                arr1[j+1]=temp;
                isSwapped=true;
            }
            }
            if(isSwapped=false){
                break;
            }
        }
        System.out.println("Bubble Sort");
        for(int i=0;i<N;i++){
            System.out.print(arr1[i] +" ");
        }
        System.out.println();

        //Selection Sort
        int[] arr3={2,4,1,55,67,11,6,0};
        int k=arr3.length;
        for(int i=0;i<k-1;i++){
            int min=i;
            for(int j=i+1;j<k;j++){
                if(arr3[j]<arr3[min]){
                    min=j;
                }
            }
            int te=arr3[min];
            arr3[min]=arr3[i];
            arr3[i]=te;
        }
        System.out.println("Selection Sort");
        for(int i=0;i<k;i++){
            System.out.print(arr3[i]+" ");
        }
        
    }

}
