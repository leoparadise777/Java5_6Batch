package Day5;

import java.util.concurrent.*;

public class ThreadPool {
    public static void main(String[] args) {
        ThreadPoolExecutor TPE = new ThreadPoolExecutor(
                2,
                5,
                2L,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(4),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );

        for (int i = 1; i<=10; i++){
            TPE.execute(
                    () -> {
                        System.out.println(Thread.currentThread().getName());
                    }
            );
        }
        TPE.shutdown();

    }
}
