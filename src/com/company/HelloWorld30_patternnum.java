package com.company;

public class HelloWorld30_patternnum {
    public static void main(String[] args) {
        int n=5;
        //printing a square pattern
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        //printing a increaseing triangle
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("@ ");
            }
            System.out.println();
        }
        System.out.println();
        // printing a decresing triangle
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print("& ");
            }
            System.out.println();
        }
        System.out.println();
        // printing a left increasing triangle
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("# ");
            }
            System.out.println();
        }
        System.out.println();
        // printing a left decreasing triangle
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++){
                System.out.print("! ");
            }
            System.out.println();
        }
        System.out.println();
        // printing the pyramid pattern
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("@");
            }
            for(int j=1;j<i;j++){
                System.out.print("@");
            }
            System.out.println();
        }
        System.out.println();
        //printing the diamond pattern
        for(int i=1;i<n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(" ");
            }
            for(int j=1;j<i;j++){
                System.out.print("#");
            }
            for(int j=1;j<=i;j++){
                System.out.print("#");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<n;j++){
                System.out.print("#");
            }
            for(int j=i;j<=n;j++){
                System.out.print("#");
            }
            System.out.println();
        }
         //printing a bowtie pattern
        System.out.println();
     /*   for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("#");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            System.out.println();
        } */
    }
}
