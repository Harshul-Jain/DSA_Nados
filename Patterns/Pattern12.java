package DSA_Nados.Patterns;

import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int val1=0;
        int val2=1;
        int n=scn.nextInt();
        for(int row=0;row<n;row++){
            for(int i=0;i<= row;i++){
                System.out.print(val1+"\t");
                int temp=val1;
                val1=val2;
                val2=temp+ val2;
            }
            System.out.println();
        }
        scn.close();
    }
}
