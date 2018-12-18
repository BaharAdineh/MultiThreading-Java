package bahar.ThreadConcept;

/**
 * Created by IntelliJ IDEA.
 * User: B_Adineh
 * Date: 12/16/2018
 * Time: 12:23 PM
 * To change this template use File | Settings | File and Code Templates.
 */


//By implementing Runnable
public class ThreadRunnable implements Runnable {

    //When implementing it to Runnable, we must implement a method called Run in its class.
    // This method is called when the thread is started (Running state).
    // In the Run method, we'll make a simple code that prints "ThreadRunnable" and its number.
    public void run() {
        for (int i = 0; i < 3; i++) {

            System.out.println("ThreadRunnable " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}