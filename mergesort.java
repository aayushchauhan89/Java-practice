import java.util.*;
public class mergesort {
    public static void main(String [] args){
        int arr[] = {-2,9,-5,8,5,9,0};
        mergeSort(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
    private static void mergeSort(int []arr){
        int n = arr.length;
        if(n==1) return ;
        int a[] = new int[n/2];
        int b[] = new int[n-n/2];
        int ind = 0;
        for(int i =0;i<a.length;i++){
            a[i] = arr[ind];
            ind++; 
        }
        for(int i =0;i<b.length;i++){
            b[i] = arr[ind];
            ind++; 
        }
        mergeSort(a);
        mergeSort(b);
        
        merge(a,b,arr);
    }
    private static void merge(int a[],int b[],int arr[]){
        int i = 0 ;
        int j = 0;
        int k = 0;
        while(a.length >i && b.length >j){
            if(a[i]>b[j]){
                arr[k]= b[j];
                j++;
                k++;
            }else{
                arr[k]=a[i];
                i++;
                k++;
            }
            
        }
        while(i<a.length){
            arr[k] = a[i];
            i++;
            k++;
        }
        while(j<b.length){
            arr[k] = b[j];
            j++;
            k++;
        }
    }

}
