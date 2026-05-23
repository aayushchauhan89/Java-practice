class mythread implements Runnable{
    public void run(){
        System.out.println("from runnable interface...");
        
    }
}
public class ThreadEXam {
    public static void main(String[] args) {
        Thread t1 = new Thread(new mythread());
        t1.start();
    }
}
