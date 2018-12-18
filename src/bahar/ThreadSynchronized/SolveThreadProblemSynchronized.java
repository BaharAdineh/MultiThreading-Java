package bahar.ThreadSynchronized;

/**
 * Created by IntelliJ IDEA.
 * User: B_Adineh
 * Date: 12/16/2018
 * Time: 1:25 PM
 * To change this template use File | Settings | File and Code Templates.
 */


//When we run two or more threads at a time,
// there may be a situation where multiple threads simultaneously attempt to access a source and produce an unexpected result.
//For example, when several threads simultaneously want to write information in a particular file.
// This will cause our information to be corrupted in the file.
public class SolveThreadProblemSynchronized {


    //Synchorized is a block.
    //We put that part of the threads that have share together into that block.
    //synchronized in java takes a object as lock  and here we put "this" instead of  it


    //What synchronized does in Java
    //It is not allowed to enter more than one thread to its block
    //And doing this by locking its block.
    //When the thread wants to enter in, it checks first whether the block is locked or not.
    //If the block was locked, it waits until the block is unlocked.
    int count = 0;

    public void increment() {
        synchronized (this) {
            count++;
        }

    }

    public void runThreads() {

        Thread th1 = new Thread(new Runnable() {

            public void run() {
                for (int i = 0; i < 10000; i++) {
                    increment();
                }
            }
        });
        Thread th2 = new Thread(new Runnable() {

            public void run() {
                for (int i = 0; i < 10000; i++) {
                    increment();
                }
            }
        });

        th1.start();
        th2.start();

        try {
            th1.join();
            th2.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println(count);

    }
}
