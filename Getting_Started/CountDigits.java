package DSA_Nados.Getting_Started;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        // write your code here  
        Scanner scn=new Scanner(System.in);
        int count=0;
        int n=scn.nextInt();
        while(n>0){
          n=n/10;
          count++;
        }
        System.out.println(count);
        scn.close();
    }
}
