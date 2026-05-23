class ArrayQueue{
    int [] arr;
    int f;
    int r;
    int size;
    ArrayQueue(int capacity){
        arr = new int[capacity];
    }

    void add(int val){
        if(size==arr.length){
            System.out.println("QUEUE IS FULL!!");
            return;
        }
        arr[r++] = val;
        if(r==arr.length) r = 0;
        size++;
    }

    int remove(){
        if(size==0){
            System.out.println("Empty");
            return -1;
        }
        int ele = arr[f];
        f++;
        if(f==arr.length) f = 0;
        size--;
        return ele;
    }
    
    int peek(){
        if(size==0){
            System.out.println("Empty");
            return -1;
        }
        int ele = arr[f];
        return ele;
    }

    void display(){
        if(size==0) return;
        if(f<r){
            for(int i=f;i<r;i++){
                System.out.print(arr[i]+ " ");
            }
            System.out.println();
        }
        else{   // f>=r
            for(int i=f;i<arr.length;i++){
                System.out.print(arr[i] + " ");
            }
            for(int i=0;i<r;i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
    
}
public class CircularQueue {
    public static void main(String [] args){
        ArrayQueue q = new ArrayQueue(4);
        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println(q.remove());
        System.out.println(q.peek());
        q.add(40);
        q.add(50);
        q.display();

    }
}
