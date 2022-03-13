import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        for(int row=0;row<n;row++){
            int icj1=1;
            for(int col=0;col<=row;col++){
                System.out.print(icj1+"\t");
                int icj=icj1*(row-col)/(col+1);
                icj1=icj;
            }
            System.out.println();
        }
        scn.close();
    }
}
