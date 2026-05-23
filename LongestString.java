import java.util.*;
public class LongestString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size : ");
        int n = sc.nextInt();
        sc.nextLine();
        String arr[] = new String[n];
        for(int i=0;i<n;i++){
            arr[i] =sc.nextLine();
        }
        String longest = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i].length()>longest.length()){
                longest = arr[i];
            }
        }
        System.out.println("longest str is : " + longest);
        sc.close();
    }
}