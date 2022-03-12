package DSA_Nados.Getting_Started;

import java.util.Scanner;

public class RotateNumber {
    public static void main(String[] args) {
        // write your code here 
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int k=scn.nextInt();
        int count=0;
        int power=1;
        int temp=n;
        while(temp>0){
          power=power*10;
          temp=temp/10;
          count++;
        }
        power=power/10;
        k=k%count;
        if(k>0){
          while(k>0){
            int digit=n%10;
            n= digit*power+ n/10;
            k--;
          }
        } 
        else{
           while(k<0){
            int digit=n/power;
            n= (n%power)*10 + digit;
            k++;
          }
        }
        System.out.println(n);
        scn.close();
       }
}
