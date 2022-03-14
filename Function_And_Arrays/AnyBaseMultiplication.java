package DSA_Nados.Function_And_Arrays;

import java.util.Scanner;

public class AnyBaseMultiplication {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
    
        int d = getProduct(b, n1, n2);
        System.out.println(d);
        scn.close();
     }
    
     public static int getProduct(int b, int n1, int n2){
         int multi=1;
         int product=0;
         while(n2>0){
             int digit=n2%10;
             int pr=getProductDigit(b,n1,digit);
             product=getSum(b,product,pr*multi);
             multi*=10;
             n2=n2/10;
         }
         return product;
     }
     private static int getProductDigit(int b,int n1,int d){
         int multi=1,ans=0;
         int carry=0;
         while(n1>0 || carry>0){
             int digit=n1%10;
             n1=n1/10;
             int pr=digit*d+carry;
             carry=pr/b;
             ans=ans+(pr%b)*multi;
             multi*=10;
         }
         return ans;
     }
     private static int getSum(int b,int n1,int n2){
         int multi=1,ans=0,carry=0;
         while(n1>0 || n2>0 || carry>0){
             int digit1=n1%10;
             int digit2=n2%10;
             int digit=digit1+digit2+carry;
             carry=digit/b;
             ans=ans+(digit%b)*multi;
             multi*=10;
             n1=n1/10;
             n2=n2/10;
         }
         return ans;
     }
    
}
