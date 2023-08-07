public class Demo2 {
    static Thread mainThread;

    public static void main(String[] args) {
        Thread t1 = new Thread(new RunnableImpl2(),"t1");
        t1.start();
        mainThread = Thread.currentThread();
        System.out.println("Main thread is about to die");
    }
}

class RunnableImpl2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 3000; i++) {
            System.out.println(i);
        }
        System.out.println("Is main thread alive :"+ Demo2.mainThread.isAlive());
    }
}