import java.util.*;
public class function{
    // public static void calculateSum(float a, float b){
    //     float sum = a+b;
    //     System.out.println(sum);
    //     return;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     float x=sc.nextFloat();
    //     float y=sc.nextFloat();
    //     calculateSum(x, y);
    //     sc.close();
    // }

    // public static void greeting(){
    //     System.out.println("JAI SHREE RAM ");
        
    // }
    // public static void main(String[] args) {
    //     greeting();
    // }
    public static void factorial(int n){
        if(n<0){
            System.out.println("Invalid number");
            return;
        }
        
        int value=1;
        for(int i=1;i<=n;i++){
            value=value*i;
        }
       System.out.println(value);
       return;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        factorial(n);
       
        sc.close();
    }
}