package DSA_Nados.Function_And_Arrays;

public class AnyBaseToDecimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int d = getValueIndecimal(n, b);
        System.out.println(d);
     }
    
     public static int getValueIndecimal(int n, int b){
        int multi=1,ans=0;
        while(n>0){
           int digit=n%10;
           ans=ans+digit*multi;
           multi*=b;
           n=n/10;
        }
        return ans;
     }
}
