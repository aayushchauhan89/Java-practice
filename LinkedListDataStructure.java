class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}

class Linkedlist{
    Node head;
    Node tail;
    int size = 0;
    void InsertAtHead(int val){
        Node temp = new Node(val);
        if(head ==null){
            head = tail = temp;
        } 
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void InsertAtTail(int val){
        Node temp = new Node(val);
        if(tail == null){
            head = tail = temp;
        }
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    void display(){
        Node temp = head;
        if(temp==null){
            System.out.println("Empty");
        }
        else{
            while(temp !=null){
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
        }
        System.out.println();
    }
    void DeleteFromHead(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
    }
    void Insert(int idx, int val){
        if(idx>size || idx<0){
            System.out.println("Invalid request");
        }
        else if(idx==0){
            InsertAtHead(val);
        }
        else if(idx==size){
           
            InsertAtTail(val);
        }
        else{
            Node temp = head;
            for(int i =0;i<idx-1;i++){
                temp = temp.next;
            }
            Node t = new Node(val);
            t.next = temp.next;
            temp.next = t;
            size++;
        }
    }
    void get(int idx){
        if(head==null){
            System.out.println("EMPTY");
        }
        else if (idx>=size) {
            System.out.println("out of limit");
        }
        else{
            Node temp = head;
            for(int i =0;i<idx;i++){
                temp = temp.next;
            }
            System.out.println("At index " + idx + ": " + temp.val);
        }
    }
    void delete(int idx){
        if(idx<0 || idx>=size){
            System.out.println("Invalid index");
        }
        else{
            Node temp = head;
            for(int i = 0;i<idx-1;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if(idx==size-1){
                tail = temp;
            }
            size--;
        }
    }
    
}
public class LinkedlistDataStructure {
    public static void main(String[] args) {
        Linkedlist LL = new Linkedlist();

        LL.InsertAtHead(10);
        LL.InsertAtHead(20);
        LL.InsertAtTail(30);
        LL.InsertAtTail(40);
        LL.display();
        LL.DeleteFromHead();
        LL.display();
        System.out.println("Size of List is : " + LL.size);
        LL.Insert(2, 54);
        LL.display();
        System.out.println("Size of List is : " + LL.size);
        LL.get(1);
        LL.delete(2);
        LL.display();
        

        
    }
}
