import java.util.*;
public class Array_practice{
    public static void Rev(int a[]){
        int  L =0;
        int R = a.length-1;
        while(L<R){
            int temp;
            temp = a[L];
            a[L]=a[R];
            a[R]=temp;
            L++;
            R--;
        }
        System.out.println(Arrays.toString(a));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array : ");
        int n = sc.nextInt();
        sc.nextLine();
        int arr[] = new int[n];
        System.out.print("enter array elements :");
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    
        Rev(arr);
        
        // arr[1]=7;
        // System.out.println("after changing : ");
        // for(int i = 0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }
        // System.out.println("kuch naya try : ");
        // System.out.println(Arrays.toString(arr));
        // sc.close();
        // System.out.println("phir kuch naya : ");
        // for(int i : arr){
        //     System.out.println(i);
        // }

        sc.close();
    }
}