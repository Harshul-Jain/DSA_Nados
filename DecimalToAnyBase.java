package DSA_Nados;

import java.util.Scanner;

public class DecimalToAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
        scn.close();
     }
    
     public static int getValueInBase(int n, int b){
         int multi=1,ans=0;
         while(n>0){
             int digit= n%b;
              ans=ans+digit*multi;
              multi*=10;
              n=n/b;
         }
         return ans;
     }
}
