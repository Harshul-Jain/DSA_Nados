package DSA_Nados.Getting_Started;

import java.util.Scanner;

public class PrintFibonacciNumbers {
    public static void main(String[] args) {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int a=0;
        int b=1;
        for(int i=0;i<n;i++){
          System.out.println(a);
          int sum=a+b;
          a=b;
          b=sum;
        }
        scn.close();
     }
}
