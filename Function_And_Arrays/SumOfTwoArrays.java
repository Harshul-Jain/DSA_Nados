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
        // int[] sum=new int[n1>n2?n1:n2];
        // int k=sum.length-1;
        // int i=n1-1;
        // int j=n2-1;
        // int carry=0;
        // while(i>=0 && j>=0){
        //     int s=arr1[i]+ arr2[j]+carry;
        //     sum[k]=s%10;
        //     carry=s/10;
        //     i--;
        //     j--;
        //     k--;
        // }
        // while(i>=0){
        //     int s=arr1[i]+carry;
        //     sum[k]=s%10;
        //     carry=s/10;
        //     i--;
        //     k--;
        // }
        // while(j>=0){
        //     int s=arr2[j]+carry;
        //     sum[k]=s%10;
        //     carry=s/10;
        //     j--;
        //     k--;
        // }
        // if(carry>0){
        //     System.out.println(carry);
        // }
        // for(int el:sum){
        //     System.out.println(el);
        // }
        scn.close();
        int[] res=sum(arr1, arr2);
        for(int el: res){
            System.out.println(el);
        }
     }
     private static int[] sum(int[] arr1,int[] arr2){
        int n1=arr1.length , n2=arr2.length;
        int n3=Math.max(n1,n2 );
        int[] res=new int[n3];
        int p1=n1-1,p2=n2-1,p3=n3-1,carry=0;
        while(p1>=0 || p2>=0){
            int v1=p1>=0?arr1[p1]:0;
            int v2=p2>=0?arr2[p2]:0;
            int sum=v1+v2+carry;
            int digit=sum%10;
            carry=sum/10;
            res[p3]=digit;
            p1--;
            p2--;
            p3--;    
        }
        if(carry!=0){
            int newRes[] =new int[n3+1];
            newRes[0]=carry;
            for(int idx=1;idx< newRes.length;idx++){
                newRes[idx]=res[idx-1];
            }
            return newRes;
        }
        return res;
     }
}
