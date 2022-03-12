package DSA_Nados.Patterns;

import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        // int row=1,nst=1,nsp=n/2;
        // while(row<=n){
        //     //print spaces
        //     for(int i=0;i<nsp;i++){
        //         System.out.print("\t");
        //     }
        //     //print stars
        //     for(int i=0;i<nst;i++){
        //         if(i==0 || i==nst-1)
        //         System.out.print("*\t");
        //         else
        //         System.out.print("\t");
        //     }
        //     //prep
        //     if(row<=n/2){
        //         nsp--;
        //         nst+=2;
        //     }
        //     else{
        //         nsp++;
        //         nst-=2;
        //     }
        //     row++;
        //     System.out.println();
        // }
        /* Approach-2 */
        int row=1,nsp=n/2,nisp=-1;
        while(row<=n){
            //Print spaces
            for(int i=0;i<nsp;i++){
                System.out.print("\t");
            }
            //Print star
            System.out.print("*\t");
            //print inner space
            for(int i=0;i<nisp;i++){
                System.out.print("\t");
            }
            //Print star
            if(row>1 & row<n)
            System.out.print("*\t");
            //prep
            if(row<=n/2){
                nsp--;
                nisp+=2;
            }
            else{
                nsp++;
                nisp-=2;
            }
            row++;
            System.out.println();
        }
        scn.close();
     }
}
