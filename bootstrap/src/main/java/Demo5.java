import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo5 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.printf("%s : %d %n", Thread.currentThread().getName(), i);
                }
                System.out.println(Thread.currentThread().getName() + " is about to die");
            }
        });
        for (int i = 0; i < 10000; i++) {
            System.out.printf("%s : %d %n", Thread.currentThread().getName(), i);
        }
        executor.shutdown();
        System.out.println("main thread is about to die");
    }
}
