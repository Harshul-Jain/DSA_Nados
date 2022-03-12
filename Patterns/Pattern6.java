package DSA_Nados.Patterns;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int row=1,nst=n/2 + 1,nsp=1;
        while(row<=n){
            //Print stars
            for(int i=0;i<nst;i++){
                System.out.print("*\t");
            }
            //Print spaces
            for(int i=0;i<nsp;i++){
                System.out.print("\t");
            }
            //Print stars
            for(int i=0;i<nst;i++){
                System.out.print("*\t");
            }
            //prep
            if(row<=n/2){
                nst--;
                nsp+=2;
            }
            else{
                nst++;
                nsp-=2;
            }
            row++;
            System.out.println();
        }
        scn.close();
    }
}
