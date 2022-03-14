package DSA_Nados.Function_And_Arrays;

import java.util.Scanner;

public class AnyBaseToAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int  destBase= scn.nextInt();
        int decimalNumber=getValueIndecimal(n,sourceBase);
        int ans=getValueInBase(decimalNumber,destBase);
        System.out.println(ans);
        scn.close();
     }  
     private static int getValueIndecimal(int n, int b){
          int multi=1,ans=0;
          while(n>0){
             int digit=n%10;
             ans=ans+digit*multi;
             multi*=b;
             n=n/10;
          }
          return ans;
       } 
      private static int getValueInBase(int n, int b){
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
