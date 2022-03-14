package DSA_Nados.Getting_Started;

import java.util.Scanner;

public class RotateNumber {
    public static void main(String[] args) {
        // write your code here 
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int k=scn.nextInt();
        // int count=0;
        // int power=1;
        // int temp=n;
        // while(temp>0){
        //   power=power*10;
        //   temp=temp/10;
        //   count++;
        // }
        // power=power/10;
        // k=k%count;
        // if(k>0){
        //   while(k>0){
        //     int digit=n%10;
        //     n= digit*power+ n/10;
        //     k--;
        //   }
        // } 
        // else{
        //    while(k<0){
        //     int digit=n/power;
        //     n= (n%power)*10 + digit;
        //     k++;
        //   }
        // }
        // System.out.println(n);
        int temp=n;
        int count=0;
        while(temp>0){
          count++;
          temp/=10;
        }
        k=k%count;
        if(k<0){
          k+=count;
        }
        System.out.println(k);
        int div=1,multi=1;
        for(int i=0;i<count;i++){
          if(i<k){
            div*=10;
          }
          else
            multi*=10;
        }
        int q=n%div;
        int r=n/div;
        int res=q*multi+r;
        System.out.println(res);
        scn.close();
      }
}
