import java.util.*;
import 
public class Try_Catch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        try{
            int c = a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e){
            System.out.println("can not divide by zero");
        }
        finally{
            System.out.println("ALways chalega");
        }
        sc.close();
    }
}
