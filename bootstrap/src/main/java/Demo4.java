public class Demo4 {
    static Thread mainTread;
    public static void main(String[] args) throws InterruptedException {
        mainTread = Thread.currentThread();
        Thread t1 = new Thread(new RunnableImpl4(), "t1");
        t1.start();
        //while (t1.isAlive());
        t1.join();
        System.out.println("Is the "+t1.getName()+" alive :" + t1.isAlive());
        System.out.println("Main thread is about to die");
    }
}

class RunnableImpl4 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.printf("%s : %d %n",Thread.currentThread().getName(),i);
        }
        System.out.println("Is the main thread still alive : " + Demo4.mainTread.isAlive());
        System.out.println(Thread.currentThread().getName() + " is about to die....");
    }
}
