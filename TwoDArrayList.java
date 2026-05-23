import java.util.*;
public class TwoDArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(3);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(2);
        b.add(4);
        b.add(6);
        arr.add(a) ; arr.add(b);
        for(int i = 0;i<arr.size();i++){
            for(int j = 0;j<arr.get(i).size();j++){
                System.out.print(arr.get(i).get(j) + " ");
            }
            System.out.println();
        }

    }
}
