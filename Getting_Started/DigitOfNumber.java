package DSA_Nados.Getting_Started;

import java.util.Scanner;

public class DigitOfNumber {
    public static void main(String[] args) {
        // write your code here  
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int temp=n;
        int length=0;
        while(temp>0){
          temp/=10;
          length++;
        }
        length--;
        int len=length;
        int pr=1;
        while(length>0){
          pr*=10;
          length--;
        }
        while(len>0){
          System.out.println(n/pr);
          n=n%pr;
          pr/=10;
          len--;
        }
        System.out.println(n);
        scn.close();
       }
}
