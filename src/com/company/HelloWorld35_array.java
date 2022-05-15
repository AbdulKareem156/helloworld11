package com.company;

public class HelloWorld35_array {
    public static void main(String[] args) {
        //single integer array
        int[] ka = new int[2];
      //  System.out.println(ka);
        //example of 1D array
        int[] ba = {1, 2, 3, 4, 5, 6};
        System.out.println(ba[4]);
        //example of 2D array
        int[][] x = {{12, 13, 8}, {14, 15, 1}, {16, 17, 5}, {10, 20, 30}};
        System.out.println(x[1][2]);
        //example of String array
        String[] g = {"Abdul", "kareem"};
        System.out.print(g[0]);
        System.out.println(" " + g[1]);
        //example of 3D array
        int[][][] z = {
                {{1, 2, 3}, {4, 5, 6}},
                {{2, 3}, {6, 7, 5}}
                       };
        System.out.println(z[0][1][0]);
        //printing a matrix using a array
        int[][] as = {{12, 13, 8,55}, {14, 15, 1,90}, {16, 17, 5,77}, {10, 20, 30,8}};
         for(int i=0;i<4;i++){
             for(int j=0;j<4;j++){
                 System.out.print(as[i] [j]);
             }
             System.out.println();
         }
    }
}
