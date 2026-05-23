import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListToArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrL = new ArrayList<>();
        for(int i = 0;i<5;i++){
            arrL.add(sc.nextInt());
        }
        System.out.println("arraylistu is : ");
        for(int i : arrL){
            System.out.println(i);
        };
        /*
         ArrayList to Array
         listName.toArray(new String[0]);   // will create array of strings
         listName.toArray(new Integer[0]);  // will create array of Integer
         listName.stream().mapToInt(Integer::intValue).toArray();
         */
        int arr[]=  arrL.stream().mapToInt(Integer::intValue).toArray();
        for(int i =0 ;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        sc.close();

        

    }
}
