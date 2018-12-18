package bahar.ThreadJoinMethod;

/**
 * Created by IntelliJ IDEA.
 * User: B_Adineh
 * Date: 12/16/2018
 * Time: 2:02 PM
 * To change this template use File | Settings | File and Code Templates.
 */
public class Sum extends Thread {
    int value;

    public void run() {
        value = 1 + 2;
    }
}