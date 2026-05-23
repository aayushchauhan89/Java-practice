import java.util.*;
public class If_else {
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    if(n==0){
        System.out.println("ZERO");
    }
    else if(n>0){
        System.out.println("POSITIVE");
    }
    else{
        System.out.println("NEGATIVE");
    }
    sc.close();


}
}
