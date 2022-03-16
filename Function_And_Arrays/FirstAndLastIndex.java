import java.util.Scanner;

public class FirstAndLastIndex {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int d=scn.nextInt();
        int first=firstIndex(arr,d);
        int last=lastIndex(arr,d);
        System.out.println(first);
        System.out.println(last);
        scn.close();
     }
     private static int firstIndex(int[] arr,int d){
         int low=0;
         int high=arr.length-1;
         int first=-1;
         while(low<=high){
             int mid=(low+high)/2;
             if(d<arr[mid]){
                 high=mid-1;
             }
             else if(d>arr[mid]){
                 low=mid+1;
             }
             else{
                 first=mid;
                 high=mid-1;
             }
         }
         return first;
     }
     private static int lastIndex(int[] arr,int d){
         int low=0;
         int high=arr.length-1;
         int last=-1;
         while(low<=high){
             int mid=(low+high)/2;
             if(d<arr[mid]){
                 high=mid-1;
             }
             else if(d>arr[mid]){
                 low=mid+1;
             }
             else{
                 last=mid;
                 low=mid+1;
             }
         }
         return last;
     }
}
