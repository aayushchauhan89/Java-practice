class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
class queue{
    Node head;
    Node tail;
    int size  = 0;
    void add(int val){
        Node temp = new Node(val);
        if(size==0){
            head = tail = temp;
        }
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    int remove(){
        if(size==0){
            System.out.println("queue already empty");
            return -1;
        }
        else if(size==1){
            int value = head.val;
            head = tail = null;
            size--;
            return value;
        }
        else{
            int value = head.val;
            head = head.next;
            size--;
            return value;  
        }
       
    }
    int peek(){
        if(size==0){
            System.out.println("queue empty");
            return -1;
        }
        else{
            return head.val;
        }
    }
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
public class QueueImplementation {
    public static void main(String [] args){
        queue q = new queue();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.display();
        System.out.println(q.size + " " +  q.remove() + " " + q.size);
        System.out.println(q.peek());


        
    }
}
 