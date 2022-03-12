package DSA_Nados.Patterns;

import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n=scn.nextInt();
        int val =1;
        for(int row=0;row<n;row++){
            for(int col=0;col<=row;col++){
                    System.out.print(val+"\t");
                    val++;
            }
            System.out.println();
        }
        scn.close();
    }
}
