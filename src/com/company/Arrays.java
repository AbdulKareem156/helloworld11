package com.company;
public class Arrays {
 public static void printArray(int arr[]){
     int n=arr.length;
     for(int i=0;i<n;i++){
         System.out.print(arr[i]+" ");
     }
     System.out.println();
 }
/* public void printA(){
     int kareem[]=new int[5];
     kareem[0]=10;
     kareem[1]=11;
     kareem[2]=12;
     kareem[3]=13;
     kareem[4]=14;
     printArray(kareem);


 }

 */

       public static int [] Array(int [] arr) {
           int oddcount = 0;
           for (int i = 0; i < arr.length; i++) {
               if (arr[i] % 2 != 0) {
                   oddcount++;
               }
           }
           int resultarr[] = new int[oddcount];
           int idx = 0;
           for (int i = 0; i < arr.length; i++) {
               if (arr[i] % 2 != 0) {
                   resultarr[idx] = arr[i];
                   idx++;
               }
           }
           return resultarr;
       }
   public static void ReverseArray(int []arr,int start,int last){
           while (start<last){
               int temp1=arr[start];
               arr[start]=arr[last];
               arr[last]=temp1;
               start++;
               last--;
           }

       }
public int findMinimum(int[] arr){
           if(arr==null||arr.length==0){
               throw new IllegalArgumentException("Invalid Input");
           }
           int min=arr[0];
           for(int i=0;i< arr.length-1;i++){
               if(arr[i]<min){
                   min=arr[i];
               }
           }
           return min;
}
  public int Secondmaxvalue(int[] arr){
      if(arr==null||arr.length==0){
          throw new IllegalArgumentException("Invalid Input");
      }
      int max=Integer.MIN_VALUE;
      int secondmax=Integer.MIN_VALUE;
      for(int i=0;i< arr.length-1;i++){
          if(arr[i]>max){
              secondmax=max;
              max=arr[i];
          }
          else if (arr[i]>secondmax&&arr[i]!=max){
              secondmax = arr[i];
          }
      }
      return secondmax;
  }
  public void endZeros(int arr[],int n){
           int j=0;
           for(int i=0;i<n;i++){
               if(arr[i]!=0 && arr[j]==0){
                   int temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
               }
               else if(arr[j]!=0){
                   j++;
               }
           }
  }
    public static void main(String[] args) {
       Arrays n=new Arrays();
        //  n.printArray(new int[] {2,3,4,555,5});
       // n.printA();
      //  System.out.println(ka[3])
        //  System.out.println(kareem[0]);
     int arr[ ] ={1,0,3,0,2,0,6,};
     ReverseArray(arr,0, arr.length-1);
    printArray(arr);
   //  int resultarr[] = Array(arr);
     //printArray(resultarr);
       // System.out.println(n.findMinimum(arr));
   //     System.out.println(n.Secondmaxvalue(arr));
        n.endZeros(arr, arr.length);
        System.out.println("Damn Good Boy");
        printArray(arr);
       
 }
}
