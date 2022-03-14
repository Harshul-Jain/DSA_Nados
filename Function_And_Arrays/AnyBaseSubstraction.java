package DSA_Nados.Function_And_Arrays;

import java.util.Scanner;

public class AnyBaseSubstraction {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
    
        int d = getDifference(b, n1, n2);
        System.out.println(d);
        scn.close();
     }
    
     public static int getDifference(int b, int n1, int n2){
         int ans=0,multi=1;
         int carry=0;
         while(n2>0){
             int digit1=n1%10;
             int digit2=n2%10;
             int digit=digit2-digit1-carry;
             if(digit<0){
                 digit=digit+b;
                 carry=1;
             }
             else{
                 carry=0;
             }
             ans=ans+digit*multi;
             multi*=10;
             n1=n1/10;
             n2=n2/10;
         }
         return ans;
     }
    
}
