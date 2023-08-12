import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo6 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(()->{
            for (int i = 0; i < 1000; i++) {
                System.out.printf("%s : %d %n", Thread.currentThread().getName(), i);
            }
            System.out.println(Thread.currentThread().getName() + " Is about to die");
        });

        for (int i = 0; i < 1000; i++) {
            System.out.printf("%s : %d %n",Thread.currentThread().getName(), i);
        }
        System.out.println(Thread.currentThread().getName() + " is about to die");

    }
}
