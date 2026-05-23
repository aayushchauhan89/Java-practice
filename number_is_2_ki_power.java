import java.util.*;
public class number_is_2_ki_power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>0 && ( n & (n-1))==0){
            System.out.println(n + " " +"is a number of power of 2");
        }
        else{
            System.out.println("not power of 2");
        }
        sc.close();
    }
   
}
