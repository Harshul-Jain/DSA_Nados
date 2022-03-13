package DSA_Nados.Patterns;

import java.util.Scanner;

public class Pattern17_2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int row=1,nsp=n/2,nst=1;
        while(row<=n){
            //Print space
            for(int i=0;i<nsp;i++){
                if(row==(n/2 + 1))
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }
            //Print star
            for(int i=0;i<nst;i++){
                System.out.print("*\t");
            }
            if(row<=n/2){
                nst++;
            }
            else{
                nst--;
            }
            row++;
            System.out.println();
        }
        scn.close();
    }
}
