import java.util.*;
public class ArrayToArrayList {
    public static void main(String[] args) {
        /*
         integer array to arraylist
         ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arrayName));
         String array to Arraylist
         ArrayList<String> list = new ArrayList<>(Arrays.asList(arrayName));
         int array to ArrayList
         for(int num : arrayName){
         list.add(num);
        }
         */
        int arr[] = {1,2,3,4,5};
        ArrayList<Integer> list = new ArrayList<>();
        for(int num: arr){
        list.add(num);
        }
        System.out.println(list);
    }
}
