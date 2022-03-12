package DSA_Nados.Patterns;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int row=1,nst=1,nspace=n-1;
        while(row<=n){
            //Print spaces
            for(int i=0;i<nspace;i++){
                System.out.print("\t");
            }
            //Print Stars
            for(int i=0;i<nst;i++){
                System.out.print("*\t");
            }
            //Prep for next line
            System.out.println();
            row++;
            nst++;
            nspace--;
        }
        scn.close();
    }
}
