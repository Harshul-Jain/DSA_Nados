package DSA_Nados.Patterns;

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int row=1,nsp=n/2,nst=1;
        while(row<=n){
            //Print space
            for(int i=0;i<nsp;i++){
                System.out.print("\t");
            }
            //Print stars
            for(int i=0;i<nst;i++){
                if( i>=nst/2 || row==(n/2)+1)
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }
            //prep
            if(row<=n/2){
                nsp--;
                nst+=2;
            }
            else{
                nst-=2;
                nsp++;
            }
            row++;
            System.out.println();

        }
        scn.close();
    }
}
