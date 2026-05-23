import java.util.*;
public class array2ArrayList {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i=0;i<n;i++){
            arrayList.add(a[i]);
        }
        System.out.println(arrayList);
        sc.close();
    }
}
