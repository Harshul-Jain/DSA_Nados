package DSA_Nados.Patterns;

import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int row=1,nsp=n-2,nval=1,val=1;
        while(row<=(n/2 +1)){
            val=1;
            for(int i=0;i<nval;i++){
                System.out.print(val+"\t");
                val++;
            }
            for(int i=0;i<nsp;i++){
                System.out.print(" \t");
            }
            val--;
            if(row ==(n/2 + 1)){
                val--;
                nval--;
            }
            for(int i=0;i<nval;i++){
                System.out.print(val+"\t");
                val--;
            }
            //prep
            nval++;
            row++;
            nsp-=2;
            System.out.println();
        }
    
        scn.close();
    }
}
