class Node{
    int val;
    Node prev;
    Node next;
    Node(int val){
        this.val = val;
    }
}
class DLL{
    Node head;
    Node tail;
    int size = 0;
    void insertAtHead(int val){
        if(head==null){
            Node a = new Node(val);
            head = tail = a;
            size++;
            return;

        }
        Node a = new Node(val);
        a.next = head;
        head.prev = a;
        head = a;
        head.prev =null;
        size++;

    }
    void insertAtTail(int val){
        if(tail==null){
            Node a = new Node(val);
            head = tail = a;
            size++;
            return;
        }
        Node a = new Node(val);
        a.prev = tail;
        tail.next = a;
        tail = a;
        tail.next = null;
    }
    void DeleteFromHead(){
        if(size==0){
            System.out.println("List is already empty");
            return;
        }
        if(size==1){
            head = tail = null;
            size--;
            return;
        }
        head = head.next;
        head.prev = null;
        size--;

    }
    void DeleteFromTail(){
        if(size==0){
            System.out.println("List is already empty");
            return;
        }
        if(size==1){
            head = tail = null;
            size--;
            return;
        }
        tail = tail.prev;
        tail.next = null;
        size--;
    }
    void insert(int idx, int val){
        if(idx<0 || idx>size){
            System.out.println("invalid Request");
            return;
        }
        if(idx==0) insertAtHead(val);
        else if(idx==size) insertAtTail(val);
        else{
            Node temp = head;
        for(int i=1;i<idx;i++){
            temp=temp.next;
        }
        Node a = new Node(val);
        a.next = temp.next;
        a.prev = temp;
        temp.next = a;
        a.next.prev =a;
        size++;

        }
    }
    void Delete(int idx){
        if(idx<0 || idx>=size){
            System.out.println("invalid Request");
            return;
        }
        if(idx==0) DeleteFromHead();
        else if(idx==size-1) DeleteFromTail();
        else{
        Node temp = head;
        for(int i=1;i<idx;i++){
            temp = temp.next;
        }
        Node toDelete = temp.next;
        temp.next = toDelete.next;
        toDelete.next.prev = temp;
        size--;
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
public class DoublyLinkedList {
    public static void main(String [] args){
        DLL dll = new DLL();
        dll.insertAtHead(10);
        dll.insertAtHead(20);
        dll.insertAtTail(30);
        dll.insertAtTail(40);
        System.out.println("size is: " + dll.size);
        dll.display();
        dll.DeleteFromHead();
        dll.DeleteFromTail();
        dll.display();
        dll.insert(2, 15);
        dll.display();
        dll.Delete(2);
        dll.display();
        return;
    }
} 