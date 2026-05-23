class MyThread implements Runnable{
    public void run(){
        System.out.println("thread running : " + Thread.currentThread().getName() +" with priority : " + Thread.currentThread().getPriority());
    }
}
public class RunnableThreadPrior {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread());
        Thread t2 = new Thread(new MyThread());
        Thread t3 = new Thread(new MyThread());
        t1.setName("thread1");
        t2.setName("thread2");
        t3.setName("thread3");
        t1.setPriority(10);
        t2.setPriority(1);
        t3.setPriority(5);
        t1.start();
        t2.start();
        t3.start();
    }
}

