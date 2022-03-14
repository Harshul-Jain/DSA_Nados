package DSA_Nados.Function_And_Arrays;

import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int max=getMax(arr);
        for(int i=max;i>0;i--){
            for(int el:arr){
                if(i<=el){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
        scn.close();
     }
    private static int getMax(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int el:arr){
            if(max<el){
                max=el;
            }
        }
        return max;
    }
}
