class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
class MyStack{
    Node head;
    int len = 0;
    void push(int val) throws Exception{
        Node temp = new Node(val);
        if(head==null){
            head = temp;
            len++;
            return;
        }
        else{
            
            temp.next = head;
            head = temp;
            len++;
            return;
        }
    }
    int pop() throws Exception{
        if(head==null){
            throw new Exception("Stack is Underflow");
        }
        else{
            int top = head.val;
            head = head.next;
            len--;
            return top;
        }

    }
    int peek() throws Exception{
        if(head==null){
            throw new Exception("Stack is Underflow");
        }
        else{
            return head.val;
        }
    }

    int size(){
        return len;
    }

    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.val);
            temp = temp.next;
        }
        System.out.println();
    }

}
public class ImplementationOfStackUsingLL {
    public static void main(String[] args) throws Exception {
        MyStack st = new MyStack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st.size());
        System.out.println(st.pop());
        System.out.println(st.size());
        System.out.println(st.peek());
        System.out.println();
        st.display();
        return;
    }
}
