import java.util.*;
public class stringPractice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=4;
        String arr[]=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLine();
        }
        System.out.println("String array is : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

       
        int count=0;
        for(int i=0;i<n;i++){
            count = count + arr[i].length();
           
        }
        System.out.println("the sum of length of all strings : " + count);
        sc.close();
    }
}