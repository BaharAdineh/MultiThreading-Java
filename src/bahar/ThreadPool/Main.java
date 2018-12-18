package bahar.ThreadPool;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {


    //Using thread pools is a good way to manage multiple threads that want to run simultaneously.
    //Java has introduced an interface to execute threads in the thread pool called Executor.
    //To manage threads, it has introduced another interface named ExecutorService.
    //Java uses the Static Executors method to build the Executors.
    //The method (newFixedThreadPool (int) is used to build the constant number of threads in the thread pool.


    //There are two other methods :
    //1- shutdown: This method tells the executor to be silenced and not accept the other thread, but those threads that were added before shutdown continue to work until they are finished.
    //2- Execute: Creates a thread and adds a thread pool to run.


    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        executor.execute(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("thread 1");
                }
            }
        });
        executor.execute(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("thread 2");
                }
            }
        });

        executor.shutdown();


    }
}
