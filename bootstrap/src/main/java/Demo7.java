import java.time.chrono.ThaiBuddhistChronology;
import java.util.TreeMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo7 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(new RunnableImpl7());
        executor.shutdown();
        for (int i = 0; i < 1000; i++) {
            System.out.printf("%s : %d %n",Thread.currentThread().getName(),i);
        }
        System.out.println(Thread.currentThread().getName() + " is about to die");
    }
}

class RunnableImpl7 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.printf("%s : %d %n",Thread.currentThread().getName(),i);
        }
        System.out.println(Thread.currentThread().getName() + " is about to die");
    }
}