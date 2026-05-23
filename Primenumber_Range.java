import java.util.*;
public class Primenumber_Range {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of testcases : " );
        int t = sc.nextInt();
        for(int i=1;i<=t;i++){
            System.out.print("enter lower range : ");
            int L = sc.nextInt();
            System.out.print("enter upper range : ");
            int H = sc.nextInt();
            if(L<2){
                L=2;
            }
            for(int j=L; j<=H;j++){
                int count = 0;
                for(int k = 2; k*k<=j;k++){
                    if(j%k==0){
                        count++;
                        break;
                    }
                }
                if(count==0){
                    System.out.println(j);
                }
            }
           
             
           
        }
        sc.close();
    }
}
