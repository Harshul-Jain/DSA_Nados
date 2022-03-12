package DSA_Nados.Getting_Started;
import java.util.*;
public class PrintAllPrimesTillN {
    public static void main(String[] args) {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int low=scn.nextInt();
        int high=scn.nextInt();
        for(int num=low;num<=high;num++){
            boolean isPrime=true;
            for(int i=2;i*i<=num;i++){
                if(num%i==0){
                    isPrime=false;
                }
            }
            if(isPrime){
                System.out.println(num);
            }
        }
        scn.close();
}}
