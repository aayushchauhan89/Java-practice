import java.util.Scanner;

public class Array{
    // public static void main(String args[]){
    //     int marks[] ={94,95,91};
    //     for(int i=0;i<marks.length;i++){
    //         System.out.print(marks[i] + " ");
    //     }
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int marks[]=new int[n];
        for(int i=0;i<n;i++){
           marks[i]=sc.nextInt();

        }
        System.out.println("Enter array is : ");
        for(int i=0;i<n;i++){
            System.out.println(marks[i]);
        }
        
        sc.close();
    }

    // TO FIND THE LENGTH OF ARRAY = ARRAY_NAME.lenght

}