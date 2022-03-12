package DSA_Nados.Patterns;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int row=1,nst=n;
        while(row<=n){
            //print Stars
            for(int i=0;i<nst;i++){
                System.out.print("*\t");
            }
            //Prep for next Line
            System.out.println();
            nst--;
            row++;
        }
        
        scn.close();
    }
}
