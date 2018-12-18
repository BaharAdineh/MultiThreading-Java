package bahar.ThreadJoinMethod;

/**
 * Created by IntelliJ IDEA.
 * User: B_Adineh
 * Date: 12/16/2018
 * Time: 2:02 PM
 * To change this template use File | Settings | File and Code Templates.
 */


public class Power extends Thread {
    double value;

    public void run() {
        value = Math.pow(4, 2);
    }
}
