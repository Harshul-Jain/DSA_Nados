package DSA_Nados.Patterns;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int nst=1;
        int row=1;
        while(row<=n){
            //Print Star
            for(int i=0;i<nst;i++){
                System.out.print("*\t");
            }
            //Next Line prep
            System.out.println();
            nst++;
            row++;
        }
        scn.close();
    }
}
