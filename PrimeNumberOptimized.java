import java.util.Scanner;

public class PrimeNumberOptimized {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of testcases : ");
        int t = sc.nextInt();
        for(int i=1;i<=t;i++){
            System.out.println("enter a number to check : ");
            int n = sc.nextInt();
            int count = 0;
            if(n == 0 || n == 1){
                System.out.println("not prime number");
            }
           else{
             for(int j = 2 ; j*j<=n;j++){
                if(n%j==0){
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.println(n + " is a prime  number");
            }
            else{
                System.out.println("not prime number");
            }
           }
        }
        sc.close();
    }
}
