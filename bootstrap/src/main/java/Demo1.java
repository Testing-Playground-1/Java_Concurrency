public class Demo1 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread());
        System.out.println("----------");
        Thread t1 = new Thread(new RunnableImpl(),"t1");
        t1.start();

    }

}
 class RunnableImpl implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread());
    }
}

