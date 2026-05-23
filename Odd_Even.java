import java.util.*;
public class Odd_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int x=sc.nextInt();
        if(x%2==0){
            System.out.println("EVEN");
        }
        else{
            System.out.println("ODD");
        }
        sc.close();
        
    }
    
}
