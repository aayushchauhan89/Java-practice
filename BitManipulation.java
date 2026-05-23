import java.util.*;
public class BitManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pos = sc.nextInt();
        // int bitmask = 1<<pos;
        // if((bitmask & n)==0){                        // get bit :- to know the bit at pos
        //     System.out.println("bit is 0");
        // }
        // else{
        //     System.out.println("bit is 1");
        // }
        
        // int bitmask = 1<<pos;
        // int newNumber = bitmask | n;   // set the bit 1 at pos
        // System.out.println(newNumber);
        // sc.close();

        // int bitmask = 1<<pos;
        // int Negbitmask = ~bitmask;
        // int newNumber = Negbitmask & n;  // clear the bit ( make the bit 0) at pos 
        // System.out.println(newNumber);

        int oper = sc.nextInt();
        int bitmask = 1<<pos;
        if(oper==1){
            int newNumber = bitmask | n;
            System.out.println(newNumber);
        }
        else{
            int Negbitmask = ~bitmask;
            int newNumber = Negbitmask & n;
            System.out.println(newNumber);
        }
        sc.close(); 
    
       
        
    }
}
