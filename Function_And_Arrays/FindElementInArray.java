package DSA_Nados.Function_And_Arrays;

import java.util.Scanner;

public class FindElementInArray {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        int d=scn.nextInt();
        int res=find(arr,d);
        System.out.print(res);
        scn.close();
        }
        public static int find(int[] arr,int d){
            for(int i=0;i<arr.length;i++){
                if(arr[i]== d){
                    return i;
                }
            }
            return -1;
        }
}
