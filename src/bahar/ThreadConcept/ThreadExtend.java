package bahar.ThreadConcept;

/**
 * Created by IntelliJ IDEA.
 * User: B_Adineh
 * Date: 12/16/2018
 * Time: 12:37 PM
 * To change this template use File | Settings | File and Code Templates.
 */
public class ThreadExtend extends Thread {
    //We extend our class from Thread.
    //And we write the Run method.
    public void run() {
        for (int i = 0; i < 3; i++) {

            System.out.println("ThreadExtend " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }
    }

}