package DSA_Nados.Patterns;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int row=1,nst=1,nsp=n/2;
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
            if(row<=n/2){
                nsp--;
                nst+=2;
            }
            else{
                nsp++;
                nst-=2;
            }
            System.out.println();
            row++;
        }
        scn.close();
    }
}
