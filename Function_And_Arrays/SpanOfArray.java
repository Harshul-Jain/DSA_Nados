package DSA_Nados.Function_And_Arrays;

import java.util.Scanner;

public class SpanOfArray {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr =new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        for(int el:arr){
            if(el>max){
                max=el;
            }
            if(el<min){
                min=el;
            }
        }
        System.out.print(max-min);
        scn.close();
     }
    
}
