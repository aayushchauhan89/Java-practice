/* 
public class IO_Variable {
    public static void main(String[] args) {
        System.out.println("Hello, World!!");
        int a=3;
        int b=10;
        int c=18;
        int sum=b+c;
        System.out.println(sum);
        System.out.println(a);
       
        
    }

}

*/

import java.util.*;
public class IO_Variable{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String name=sc.nextLine();
        int a=sc.nextInt();
        int b=sc.nextInt();
        float d=sc.nextFloat();
        float c=a*b*d;
        System.out.println(name);
        System.out.println(c);
        sc.close();


    }
}