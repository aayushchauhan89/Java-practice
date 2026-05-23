import java.util.*;
public class practice {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int value = 1;
        for(int i=1;i<=b;i++){
            value = value*a;
        }
        System.out.println("a ki power b is : " + value);
        sc.close();
    }
    
}
