import java.util.*;

public class OrderIT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        sc.nextLine();

        String[] shuff = new String[n];
        for (int i = 0; i < n; i++) {
            shuff[i] = sc.nextLine();
        }

        sc.nextLine();

        String[] org = new String[n];
        for (int i = 0; i < n; i++) {
            org[i] = sc.nextLine();
        }

        
        Map<String, Integer> pos = new HashMap<>();
        for (int i = 0; i < n; i++) {
            pos.put(org[i], i);
        }

        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = pos.get(shuff[i]);
        }

       
        int longest = 1, current = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                current++;
                longest = Math.max(longest, current);
            } else {
                current = 1;
            }
        }

        
        int minOperations = n - longest;
        System.out.println(minOperations);
    }
}
