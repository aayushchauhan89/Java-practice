import java.util.*;


public class Linear_Search {
    public static void main(String[] args) {
        
    
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter array elements : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println("please enter element for Search : ");
        int item = sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==item){
                System.out.println("The element" + " " + item + " "+ "is found at"+ " "+i);
            }
        }
        sc.close();
    }
}
