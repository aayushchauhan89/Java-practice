
import java.util.*;
class Solution {
    public int primePalindrome(int n) {

        int m = n*n;
        int r = 0;
        int isprime[] = new int[m+1];
        Arrays.fill(isprime,1);
        isprime[0] = isprime[1] = 0;
        for(int i=n;i*i<m;i++){
            if(isprime[i]==1){
                for(int j = i*i;j<=m;j=j+i){
                    isprime[j]=0;
                }
            }
        }
        for(int i = n; i<=n*n;i++){
            if(isprime[i]==1){
                int x = i;
                    
                while(i!=0){
                    r = r*10 + i%10;
                    i = i/10;
                }
                if(x==r){
                    break;
                        
                        
                }
            }
        }
        return r;
            
    
        

           
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = primePalindrome()

        
    }
}