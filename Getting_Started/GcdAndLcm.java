package DSA_Nados.Getting_Started;

import java.util.Scanner;

public class GcdAndLcm {
    public static void main(String[] args) {
        // write your code here  
        Scanner scn=new Scanner(System.in);
        int num1=scn.nextInt();
        int num2=scn.nextInt();
        int temp1=num1,temp2=num2;
        while(num2!=0){
          int temp=num1;
          num1=num2;
          num2=temp%num2;
        }
        System.out.println(num1);
        System.out.println((temp1*temp2)/num1);
        scn.close();
       }
}
