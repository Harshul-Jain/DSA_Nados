package DSA_Nados.Patterns;

import java.util.Scanner;

public class PatternInvertedHourGlass {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int row=1,nsp=0,nst=n;
        while(row<=n){
            //Print space
            for(int i=0;i<nsp;i++){
                System.out.print("\t");
            }
            //Print stars
            for(int i=0;i<nst;i++){
                if(row>n/2 && row<n){
                    if(i==0 || i==nst-1)
                        System.out.print("*\t");
                    else
                        System.out.print("\t");
                }
                else
                    System.out.print("*\t");
            }
            //prep
            if(row<=n/2){
                nsp++;
                nst-=2;
            }
            else{
                nsp--;
                nst+=2;
            }
            row++;
            System.out.println();
        }
        scn.close();
     }
}
