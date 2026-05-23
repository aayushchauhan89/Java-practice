import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>();
        for(int i =0;i<5;i++){
            // list.add(sc.nextInt());
            list.add(sc.nextLine());
        }
        System.out.println("arraylist is : ");
        // for(int num : list){
        //     System.out.println(num);
        // }
        for(String s : list){
            System.out.println(s);
        }
        System.out.println("alag tareeke se print krta hu : ");
        for(int i = 0 ;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("size puchta hu : ");
        System.out.println(list.size());
        list.remove(2);
        System.out.println("after hataing : ");
        for(int i = 0 ;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("size puchta hu : ");
        System.out.println(list.size());
        list.set(3,"69");
        System.out.println("after setting 69 at 3  : ");
        for(int i = 0 ;i<list.size();i++){
            
            System.out.println(list.get(i));
        }
        System.out.println(list.contains("2"));
        //list.clear();
        System.out.println(list.contains("2"));
        list.add(2,"4");
        for(int i = 0 ;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println(" again size puchta hu : ");
        System.out.println(list.size());
        
        sc.close();
        
       
    }
}
