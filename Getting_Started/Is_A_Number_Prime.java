package DSA_Nados.Getting_Started;
import java.util.*;
  
  public class Is_A_Number_Prime{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
  
       // write ur code here
       int t=scn.nextInt();
       while(t>0){
         t--;
         int n= scn.nextInt();
          boolean isPrime=false;
         for(int i=2;i*i<=n;i++){
           if(n%i==0){
             isPrime=true;
             break;
           }
         }
         if(isPrime){
           System.out.println("not prime");
         }
         else{
           System.out.println("prime");
         }
       }
       scn.close();
   }
  }