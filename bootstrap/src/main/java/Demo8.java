public class Demo8 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        for (int i = 0; i < 1000; i++) {
            System.out.printf("%s : %d %n",Thread.currentThread().getName(),i);
        }
        System.out.println("Main thread is about to die");
    }
}

class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.printf("%s : %d %n" , Thread.currentThread().getName(), i);
        }
    }
}
