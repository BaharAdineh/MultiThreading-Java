package bahar.ThreadSemaphore;

/**
 * Created by IntelliJ IDEA.
 * User: B_Adineh
 * Date: 12/16/2018
 * Time: 1:57 PM
 * To change this template use File | Settings | File and Code Templates.
 */
public class ThreadSemaphore {


    //Semaphore consists of a simple int variable and two methods:
    //1- Acquire
    //2- Release
    //The acquire method allows us to enter the critical area, which is not another thread.
    //The release method also informs that the critical area is empty.
    //When a thread calls the release method, another thread that is in the acquire state is aware of the empty region of
    //the critical region and acquire allows the entry of the second thread.


    private int value;

    public ThreadSemaphore(int value) {
        this.value = value;
    }

    public synchronized void acquire() {
        while (value <= 0) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        value--;
    }

    public synchronized void release() {
        ++value;
        notify();
    }
}

