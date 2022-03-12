package DSA_Nados.Patterns;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int row=1,nst=n,nsp=0;
        while(row<=n){
            //Print spaces
            for(int i=0;i<nsp;i++){
                System.out.print("\t");
            }
            //Print stars
            for(int i=0;i<nst;i++){
                 System.out.print("*\t");
            }
            //prep
            System.out.println();
            nsp++;
            nst--;
            row++;
        }
        scn.close();
    }
}
