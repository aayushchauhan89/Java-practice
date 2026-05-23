import java.util.*;
class Arraylist{
    int arr[];
    int ind = 0;
    int size = 0;
    Arraylist(int cap){
        
        arr = new int[cap];
    }
    void add(int ele){
        if(ind==arr.length){
            int arr2[] = new int[arr.length*2];
            for(int i = 0;i<arr.length; i++){
                arr2[i] = arr[i];
            }
            arr = arr2;
        }
        arr[ind] = ele;
        ind++;
        size++;
    }
    void display(){
        for(int i = 0;i<size;i++){
            System.out.print(arr[i] + " ");
        }
    }
    void get( int i){
        System.out.println(arr[i]);
    }
}

public class ownArraylist{
    public static void main(String [] args){
        Arraylist a = new Arraylist(4);
        a.add(10);
        a.add(30);
        a.add(20);
        a.add(40);
        a.add(12);
        a.add(9);

        a.get(2);
        
        a.display();

        
    }
}