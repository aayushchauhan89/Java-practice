import java.util.*;
public class Switch_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        float  a = sc.nextFloat();
        System.out.println("enter operator");
        sc.nextLine();
        String ch = sc.nextLine();
        System.out.println("enter second number");
        float b=sc.nextFloat();
        switch(ch){
            
            case "+":
            System.out.println("result is : " + (a+b));
            break;

            case "-":
            System.out.println("result is : " + (a-b));
            break;

            case "*":
            System.out.println("result is : " + (a*b));
            break;

            case "/":
            if(b!=0){
                System.out.println("result is : " + (a/b));
            

            }
           else{
            System.out.println("Division not possible");
           }
           break;

            default:
            System.out.println("please enter valid input");

        }
        sc.close();
    }
}


        

        