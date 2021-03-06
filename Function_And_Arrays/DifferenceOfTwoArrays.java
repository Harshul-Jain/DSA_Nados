package DSA_Nados.Function_And_Arrays;

import java.util.Scanner;

public class DifferenceOfTwoArrays {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
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
        int[] diff=new int[n2];
        int i=n1-1;
        int j=n2-1;
        int c=0;
        while(i>=0 ||j>=0){
            int val1=i>=0? arr1[i]:0;
            int val2=j>=0? arr2[j]:0;
            int d=val2-val1-c;
            if(d<0){
                d=d+10;
                c=1;
            }
            else{
                c=0;
            }
            diff[j]=d%10;
            i--;
            j--;
        }
        
        int x=0;
        while(x<diff.length && diff[x]==0){
            x++;
        }
        for(;x<diff.length;x++){
            if(x==0 && diff[x]==0)
                continue;
            System.out.println(diff[x]);
        }
        scn.close();
    }

}
