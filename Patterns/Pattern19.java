package DSA_Nados.Patterns;

import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==n/2 || j==n/2){
                    System.out.print("*\t");
                }
                else if(j==n-1 && i<n/2){
                    System.out.print("*\t");
                }
                else if(i<n/2 && j<n/2 && i==0){
                    System.out.print("*\t");
                }
                else if(i>n/2 && j==0){
                    System.out.print("*\t");
                }
                else if(i>n/2 && j>n/2 && i==n-1){
                    System.out.print("*\t");
                }
                else{
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }
        scn.close();
     }
}
