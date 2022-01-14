package threads;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        //System.out.println(Thread.activeCount());                       //2
        //Thread.currentThread().setName("MAIN THREAD!!");                //Changing the name of the thread
        //System.out.println(Thread.currentThread().getName());           //main

        //System.out.println(Thread.currentThread().isAlive());  //this gives boolean expression *true  //you can check to see if a thread is currently alive
        //Thread.currentThread().setPriority(10); // you can set the thread priority between 1-10
       // System.out.println(Thread.currentThread().getPriority());       //to check the threads Priority*  *5* ON a scale  1 to 10

        /*for (int i = 3; i>0; i--) {     //you can have a thread sleep so, it's like program is paused
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("You are done!! :)");*/

        MyThread thread2 = new MyThread(); //why is it false?

        thread2.setDaemon(true);                //true
        System.out.println(thread2.isDaemon()); // false

        thread2.start();                    //you need the thread to start.  and it makes use of the run function

        ////System.out.println(thread2.isAlive()); // returns false
        ////thread2.setName("2nd Thread");
        ////System.out.println(thread2.getName()); //console will print Thread-0
    }
}
/* Thread = a thread of execution in a program (kind of like a virtual CPU)
          = The JVM allows an application to have multiple threads running currently
          = Each thread can execute parts of code in parallel with the main thread
          = Each thread has priority
          = Threads with a higher priority are executed in preference compared to thread with a lower priority
          --------------------
          The Java Virtual Machine continues to execute threads with either of the following
          1. The exit method of class Runtime has been called
          2. All user threads have died

          = When a JVM starts up, there is a thread which calls the **main method
          =**This thread is called "main"



 */