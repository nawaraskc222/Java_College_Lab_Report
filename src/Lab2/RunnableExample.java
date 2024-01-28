package Lab2;


//.//1 a
//Implementation of the Runnable interface
class MyRunnable implements Runnable {
 @Override
 public void run() {
     for (int i = 1; i <= 5; i++) {
         System.out.println(Thread.currentThread().getId() + " Value " + i);
     }
 }
}

public class RunnableExample {
 public static void main(String args[]) {
     // Creating multiple threads using Runnable
     Thread thread1 = new Thread(new MyRunnable());
     Thread thread2 = new Thread(new MyRunnable());

     // Start the threads
     thread1.start();
     thread2.start();
 }
}
