package DSA_Nados.Getting_Started;

import java.util.Scanner;

public class InverseOfNumber {
    public static void main(String[] args) {
        // write your code here 
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int ans=0;
        int count=1;
        while(n>0) {
          int digit=n%10;
          ans=ans+ count*(int)Math.pow(10,digit-1);
          count++;
          n=n/10;
        }
        System.out.println(ans);
        scn.close();
       }
}
