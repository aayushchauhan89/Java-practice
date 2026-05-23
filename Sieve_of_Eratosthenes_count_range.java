import java.util.*;
public class Sieve_of_Eratosthenes_count_range {
    public static int function_prime(int n){
        if(n<=1){
            return 0;
        }
        int isprime [] = new int[n+1];
        Arrays.fill(isprime,1);
        isprime[0]=isprime[1]=0;
        for(int i =2 ;i*i<=n;i++){
            if(isprime[i]==1){
                for(int j = i*i;j<=n;j=j+i){
                    isprime[j]=0;
                }
            }
        }
        int count = 0;
        for(int i =2;i<=n;i++){
            if(isprime[i]==1){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("enter lower range : " );
        int L = sc.nextInt();
        System.out.print("enter upper range : " );
        int H = sc.nextInt();
        int r = function_prime(H) - function_prime(L-1);
        System.out.print("the count of prime number between " + L + " and " + H + " are : " + r);
        sc.close();

    }
}
