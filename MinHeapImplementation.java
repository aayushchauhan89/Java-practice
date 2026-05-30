class Heap{
    int arr[];
    int idx = 1;
    int size = 0;
    Heap(int capacity){
        arr = new int[capacity+1];
    }
    void add(int ele){
        arr[idx++] = ele;
        int root = idx-1;
        while(root!=1){
            int parent = root/2;
            if(arr[root]<arr[parent]){
                int temp = arr[parent];
                arr[parent] = arr[root];
                arr[root] = temp;
                root = parent;
            }
            else{
                break;
            }

        }
    }
    int peek(){
        
            return arr[1];
    }
    int size(){
        return idx-1;
    }
    void display(){
        for(int i=1;i<idx;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    int remove(){
        if(idx==1) System.out.println("Heap is empty");
        
           int min = arr[1];
            arr[1] = arr[idx-1];
            idx--;
            int root = 1;
            while(root<=size()){
                int left = 2*root;
                int right = 2*root +1;
                int leftval = (left<=size()) ? arr[left] :Integer.MAX_VALUE;
                int rightval = (right<=size()) ? arr[right]: Integer.MAX_VALUE;
                if(arr[root]<leftval && arr[root]<rightval) break;
                else{
                    if(leftval<rightval){
                        int temp = arr[root];
                        arr[root] = arr[left];
                        arr[left] = temp;
                        root = left;
                    }
                    else{
                        int temp = arr[root];
                        arr[root] = arr[right];
                        arr[right] = temp;
                        root = right;
                    }
                }
            }
            
        
        return min;
    }
}

public class MinHeapImplementation{
    public static void main(String[] args) {
        Heap h = new Heap(10);
        h.add(10);
        h.add(15);
        h.add(8);
        h.add(9);
        h.add(4);
        h.display();
        System.out.println(h.remove());
        h.display();
        h.add(2);
        h.display();
        System.out.println(h.remove());
        h.display();

    }
}