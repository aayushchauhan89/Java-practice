import java.util.*;
public class ToggleBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pos = sc.nextInt();
        int bitmask = 1<<pos;
        int newNumber = bitmask ^ n;
        System.out.println(newNumber);
        sc.close();
        
        
    }
}
