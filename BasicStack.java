import java.util.Stack;
public class BasicStack {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        System.out.println(st.isEmpty());
        st.push("Aayu");
        st.push("Sagu");
        st.push("ksh");
        st.push("rtk");
        System.out.println(st);
        System.out.println(st.peek());
        st.pop();
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st);
        
    }
}
