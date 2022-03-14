package DSA_Nados.Function_And_Arrays;

import java.util.Scanner;

public class AnyBaseAddition2 {
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
         int carry=0;
         int multi=1;
         int ans=0;
         while(n1>0 || n2>0 || carry>0){
             int digit1=n1%10;
             int digit2=n2%10;
             int sum= digit1+digit2 + carry;
             int digit=sum%b;
             carry=sum/b;
             ans+=digit*multi;
             multi*=10;
             n1=n1/10;
             n2=n2/10;
         }
         return ans;
     }
}
