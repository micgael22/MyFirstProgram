package multiThreading;

public class Main {
    public static void main(String[] args) throws InterruptedException {  // throws interruption is for Join Method

        MyThread thread1 = new MyThread();

        MyRunnable runnable1 = new MyRunnable();

        Thread thread2 = new Thread(runnable1);// other way of creating a thread

        //thread1.setDaemon(true);
        //thread2.setDaemon(true);

        thread1.start();
        thread1.join(3000); // calling thread (example.main) wait until the specified thread dies or wait for x milliSecs
        thread2.start();
    }
}
/* multiThreading = Process of executing multiple Threads simultaneously
                  = Helps maximum utilization of CPU
                  = Threads are independent, they don't affect the execution of other threads.
                  = An exception in one thread will not interrupt other threads
                  = useful for serving multiple clients, multiple player games, or other mutually independent tasks

first way is to create a subclass of the thread class and makes sure it extends the thread class to have access to a run method

the second way is to create a class that implements the runnable interface
and take the instance and passed it as an argument to the constructor of the thread class

*****the benefits of multi threading*****
    if one of the threads inCounters an exception and get interrupted the other threads will still continue

    *join* method so th calling thread that calls the join method will wait for a thread to die until it resumes
 */