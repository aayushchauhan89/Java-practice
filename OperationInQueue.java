import java.util.LinkedList;
import java.util.Queue;


public class OperationInQueue {
    private static void addAtIndex(Queue<Integer> q, int idx, int val){
        int n = q.size();
        for(int i =1;i<=idx;i++){
            q.add(q.remove());
        }
        q.add(val);
        for(int i =1;i<=n-idx;i++){
            q.add(q.remove());
        }
    }
    private static int removeAtInd(Queue<Integer> q, int idx){
        int n = q.size();
        for(int i = 1;i<=idx;i++){
            q.add(q.remove());
        }
        int rem = q.remove();
        for(int i = 1;i<=q.size()-idx;i++){
            q.add(q.remove());
        }
        return rem;

    }
    private static int peekFromIndex(Queue<Integer> q, int idx){
        int n = q.size();
        for(int i =1;i<=idx;i++){
            q.add(q.remove());
        }
        int peek_ele = q.peek();
        for(int i=1;i<=n-idx;i++){
            q.add(q.remove());
        }
        return peek_ele;
    }


    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        addAtIndex(q,3,45);
        System.out.println(q);
        int answrem = removeAtInd(q,3);
        System.out.println(answrem);
        System.out.println(q);
        int peeku = peekFromIndex(q,3);
        System.out.println(peeku);
        System.out.println(q);
        
    }
}
