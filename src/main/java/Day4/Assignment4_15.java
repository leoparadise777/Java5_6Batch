package Day4;

import java.util.concurrent.ArrayBlockingQueue;

public class Assignment4_15 {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> q = new ArrayBlockingQueue<String>(1024);

        ThreadRead r = new ThreadRead(q);
        ThreadWrite w = new ThreadWrite(q);

        new Thread(r).start();
        new Thread(w).start();

    }
}
