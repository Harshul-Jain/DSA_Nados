package DSA_Nados.Patterns;

import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n=scn.nextInt();
        for(int row=0;row<n;row++){
            for(int i=0;i<n;i++){
                if(row==i || i==n-row-1)
                System.out.print("*\t");
                else
                System.out.print("\t");
            }
            System.out.println();
        }
        scn.close();
    }
}
