package DSA_Nados.Function_And_Arrays;

import java.util.Scanner;

public class SumOfTwoArrays {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n1=scn.nextInt();
        int[] arr1=new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i]=scn.nextInt();
        } 
        int n2=scn.nextInt();
        int[] arr2=new int[n2];
        for(int i=0;i<n2;i++){
            arr2[i]=scn.nextInt();
        }
        int[] sum=new int[n1>n2?n1:n2];
        int k=sum.length-1;
        int i=n1-1;
        int j=n2-1;
        int carry=0;
        while(i>=0 && j>=0){
            int s=arr1[i]+ arr2[j]+carry;
            sum[k]=s%10;
            carry=s/10;
            i--;
            j--;
            k--;
        }
        while(i>=0){
            int s=arr1[i]+carry;
            sum[k]=s%10;
            carry=s/10;
            i--;
            k--;
        }
        while(j>=0){
            int s=arr2[j]+carry;
            sum[k]=s%10;
            carry=s/10;
            j--;
            k--;
        }
        if(carry>0){
            System.out.println(carry);
        }
        for(int el:sum){
            System.out.println(el);
        }
        scn.close();
     }
}
