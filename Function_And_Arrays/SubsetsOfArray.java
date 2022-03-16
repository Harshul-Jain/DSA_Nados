import java.io.*;
public class SubsetsOfArray {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
           arr[i] = Integer.parseInt(br.readLine());
       }
       int limit=(int)Math.pow(2,arr.length);
       for(int i=0;i<limit;i++){
         int temp=i;
         String s="";
         for(int j=arr.length-1;j>=0;j--){
           int rem=temp%2;
           temp/=2;
           if(rem==0){
             s="-\t"+s;
           }
           else{
             s=arr[j]+"\t"+s;
           }
         }
         System.out.println(s);
       }
     }
}
