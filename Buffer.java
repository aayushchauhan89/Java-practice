import java.io.*;
import java.util.*;

public class Buffer {
    public static void main(String [] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        String str [] = br.readLine().split(" ");
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(str[i]);
        }
        System.out.println();
        for(int ele:arr){
            System.out.print(ele + " ");
        }
        return;
    }
}
