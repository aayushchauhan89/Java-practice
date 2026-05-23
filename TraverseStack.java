import java.util.Stack;

public class TraverseStack {
    public static void main(String [] args){
        Stack<Integer> st1 = new Stack<>();
        st1.push(1);
        st1.push(2);
        st1.push(3);
        st1.push(4);
        st1.push(5);
        int idx = 2;
        Stack<Integer> st2 = new Stack<>();
        while(st1.size()>3){
            st2.push(st1.pop());
        }
        // System.out.println(st1.peek()); // if want to access/ get element at idx ;
        //st1.push(17); // if want to push an element at idx +1 ;
        st1.pop(); // if want to remove element from idx;
        while(st2.size()>0){
            st1.push(st2.pop());
        }
        System.out.println(st1);

    }
}
