package bahar.ThreadJoinMethod;


public class Main {


    //Starting a thread is our hand but
    //Do we know about it when it's over ?!
    //Do we need to define a variable to know when the thread ends ?!
    //The answer is to use the join method in java.
    //Each thread has a method called Join.
    //If the Join method is called, until the thread is over, the next line of the code will not be executed.

    public static void main(String[] args) {


        Sum t1 = new Sum();
        Power t2 = new Power();

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        double n = ((double) t2.value / t1.value);

        System.out.println(n);
    }
}


