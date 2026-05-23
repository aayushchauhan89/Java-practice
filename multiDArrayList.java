import java.util.Scanner;
import java.util.ArrayList;
public class multiDArrayList {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i =0;i<3;i++){
            list.add(new ArrayList<>());

        }
        for(int i =0;i<3;i++){
            for(int j =0;j<3;j++){
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);
        list.get(1).set(1,108);
        System.out.println(list);
        sc.close();
    }
}
