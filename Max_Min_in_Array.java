import java.util.*;
public class Max_Min_in_Array {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        // int max = arr[0];
        // int min=arr[0];
        // for(int i=0;i<n;i++){
        //     if(arr[i]>max){
        //         max=arr[i];
        //     }
        //     if(arr[i]<min){
        //         min=arr[i];
        //     }
        // }
        // System.out.println("the maximum element in array is"+" " + max);
        // System.out.println("the minimum element in array is"+ " "+ min);
        // sc.close();
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        System.out.println("maximum element is"+ " "+ max);
        System.out.println("minimum element is"+ " "+ min);
        sc.close();
    }
}
