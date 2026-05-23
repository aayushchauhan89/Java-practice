import java.util.Stack;

public class PushAtBottom {
    public static void main(String [] args){
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        int ele = 5;
        System.out.println(st);
        reverse(st);
        System.out.println(st);

    }
    public static void PuttAtBot(Stack<Integer> st, int ele){
        if(st.size()==0){
            st.push(ele);
            return;
        }
        int top = st.pop();
        PuttAtBot(st, ele);
        st.push(top);
    }
    public static void reverse(Stack<Integer> st){
        if(st.size()<=1){
            return;
        }
        int top = st.pop();
        reverse(st);
        PuttAtBot(st, top);
    }
}
