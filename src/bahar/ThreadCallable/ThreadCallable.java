package bahar.ThreadCallable;

import java.util.concurrent.Callable;

/**
 * Created by IntelliJ IDEA.
 * User: B_Adineh
 * Date: 12/16/2018
 * Time: 2:05 PM
 * To change this template use File | Settings | File and Code Templates.
 */

public class ThreadCallable implements Callable<String> {

    private int id;

    public ThreadCallable(int id) {
        this.id = id;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(500);
        return "ThreadCallable: " + id;
    }


}