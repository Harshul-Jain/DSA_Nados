package DSA_Nados.Patterns;

import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int row=1,nsp=n/2,nval=1,val=1;
        while(row<=n){
            //Print space
            for(int i=0;i<nsp;i++){
                if(row>1)
                System.out.print("\t");
            }
            //print value
            for(int i=0;i<nval;i++){
                System.out.print(val+"\t");
                if(i<nval/2){
                    val++;
                }
                else
                    val--;
            }
            //prep
            if(row<=n/2){
                nsp--;
                nval+=2;
                val+=2;
            }
            else{
                nsp++;
                nval-=2;
            }
            row++;
            System.out.println();
        }
        scn.close();
    }
}
