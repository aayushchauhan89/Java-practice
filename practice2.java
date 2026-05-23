import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    String ar[]= new String[n];
    for(int i=0;i<n;i++){
        ar[i]=sc.nextLine();
    }
    System.out.println("Array elements is : ");
    for(int i=0;i<n;i++){
        System.out.print(ar[i]+" ");
    }
    sc.close();
}
    
}
