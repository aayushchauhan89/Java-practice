import java.util.*;
public class throws_example{
    static void div(int a, int b) throws ArithmeticException{
        int r = a/b;
        System.out.println("division result is : " + r);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        try{
            div(a,b);
        }
        catch(ArithmeticException e){
            System.out.println("can not divide by zero");
        }
        
    }
}