import java.util.*;
public class Bitcount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int count = 0;
        // while(n>0){                    // without built in function
        //     if((n&1)==1){
        //         count++;
        //     }
            
        //     n =n>>1;
        
        // }
        // System.out.println("the no'of 1's is : "+ count);
        int c = Integer.bitCount(n);           // with built in function
        System.out.println(c);
        sc.close();
    }
}
