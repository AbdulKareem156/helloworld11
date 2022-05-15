/*package com.company;

import java.util.Scanner;

public class HelloWorld38{
    public static void main(String[] args) {
        //binary search\\
        int[] a={12,13,15,23,34,45,56,67,78,79,89,100};
        Scanner z=new Scanner(System.in);
        System.out.println("Enter the arry element ");
        int key =z.nextInt();
        int low=0,high=a.length-1,mid;
        mid =low+high/2;
        while(low<=high){
            if(a[mid]==key){
                System.out.println("The given number is found at index "+mid+" of array");
                break;
            }
         else if(a[mid]>key) {
                high = mid - 1;
                for (int i = low; i <= high; i++) {
                    if (a[i] == key) {
                        System.out.println("element found at " + i+" of array");
                        break;
                    }
                }
                break;
            }
         else  if(a[mid]<key){
             low=mid+1;
             for(int i=low;i<=high;i++){
                 if(a[i]==key) {
                     System.out.println("element found at " + i+" of array");
                     break;
                 }
             }
             break;
            }
            }
          while (low>high){
           System.out.println();
         }

        System.out.println("good job kareem");
            }
        }

*/

