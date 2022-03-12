package DSA_Nados.Patterns;

import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int row=1,nst=1;
        while(row<=n){
            for(int i=1;i<=nst;i++){
                if(row==i){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            //prep
            nst++;
            row++;
            System.out.println();
        }
        scn.close();
    }
}
