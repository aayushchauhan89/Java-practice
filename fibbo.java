import java.util.*;
public class fibbo {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of terms  : ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        if(n==1){
            System.out.println(a);
        }
        else{
            System.out.print(a + " , " + b );
            for( int i= 3 ; i<=n; i++){
                int t = a+b;
                System.out.print(" , " + t);
                a = b;
                b = t;
                }
        }
        sc.close();
        

    }
}
