package DSA_Nados.Getting_Started;

import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        //   Write your code here
    Scanner scn=new Scanner(System.in);
    int a=scn.nextInt();
    int b=scn.nextInt();
    int c=scn.nextInt();
    int max=(c>(b>a ? b:a)? c : (b>a ? b:a));
    if(max==a){
        boolean ans = (b*b + c*c) == a*a;
        System.out.println(ans);
    }
    else if(max==b){
        boolean ans = (a*a + c*c) == b*b;
        System.out.println(ans);
    }
    else{
        boolean ans = (b*b + a*a) == c*c;
        System.out.println(ans);
    }
    scn.close();
    }
}
