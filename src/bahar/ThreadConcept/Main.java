package bahar.ThreadConcept;


public class Main {


    public static void main(String[] args) {


        //With   Runnable
        Thread thR1 = new Thread(new ThreadRunnable());
        Thread thR2 = new Thread(new ThreadRunnable());

        thR1.start();
        thR2.start();


        // wirth   Extend
        ThreadExtend thE1 = new ThreadExtend();
        ThreadExtend thE2 = new ThreadExtend();

        thE1.start();
        thE2.start();


        //Create anonymous class using Runnable.
        //In the main method, when constructing a thread from a thread class, we construct an anonymous class inside the constructor.
        //This is done by renovating the runnable constructor.
        Thread th1 = new Thread(new Runnable() {

            public void run() {
                for (int i = 0; i < 3; i++) {

                    System.out.println("Thread " + i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }

            }
        });

        th1.start();
    }
}


