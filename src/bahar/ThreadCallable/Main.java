package bahar.ThreadCallable;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

    //Thread and Runnable do not return a value.
    //From the fifth edition of Java, two interfaces called Callable and Future were defined, which, together with each other,
    //return a value of a thread.

    //If a class implements the Callable interface, it can be added to ThreadPool.
    //Callable is called Call, which is similar to the Run method in the Thread.
    //The two main differences between the Run and Call methods can be called the Return value and the Thrown Exception (both
    //features are not in the Run method).

    //When we give a callable to the threadPool, it returns an object from the Future Interface.
    //This object is similar to Thread and informs us when Callable returns a certain amount.

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        List<Future<String>> list = new ArrayList<Future<String>>();

        for (int i = 0; i < 5; i++) {
            Future<String> future = executor.submit(new ThreadCallable(i + 1));
            list.add(future);
        }

        for (Future<String> future : list) {
            try {
                System.out.println(future.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

        executor.shutdown();

    }
}