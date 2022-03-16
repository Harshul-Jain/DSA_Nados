import java.util.Scanner;

public class BrokenEconomy{
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int d=scn.nextInt();
        int ceil=-1;
        int floor=-1;
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]<d){
                low=mid+1;
                floor=mid;
            }
            else if(d<arr[mid]){
                high=mid-1;
                ceil=mid;
            }
            else{
                floor=mid;
                ceil=mid;
                break;
                
            }
        }
        System.out.println(arr[ceil]);
        System.out.println(arr[floor]);
        scn.close();
     }
    
    
    
}