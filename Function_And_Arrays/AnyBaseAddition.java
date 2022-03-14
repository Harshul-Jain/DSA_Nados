package DSA_Nados.Function_And_Arrays;

import java.util.Scanner;

public class AnyBaseAddition {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
    
        int d = getSum(b, n1, n2);
        System.out.println(d);
        scn.close();
     }
    
     public static int getSum(int b, int n1, int n2){
         n1=getValueDecimal(n1,b);
         n2=getValueDecimal(n2,b);
         int sum=n1+n2;
         return getValueBase(sum,b);
     }
     private static int getValueDecimal(int n,int b){
         int multi=1,ans=0;
         while(n>0){
             int digit = n%10;
             ans=ans+ digit*multi;
             multi*=b;
             n=n/10;
         }
         return ans;
     }
     private static int getValueBase(int n,int b){
         int multi=1,ans=0;
         while(n>0){
             int digit=n%b;
             ans=ans+ digit*multi;
             multi*=10;
             n=n/b;
         }
         return ans;
     }
}
