package Lab2;
//  1 b

class MyThread extends Thread {
 @Override
 public void run() {
     for (int i = 1; i <= 5; i++) {
         System.out.println(Thread.currentThread().getId() + " Value " + i);
     }
 }
}

public class ThreadExample {
 public static void main(String args[]) {
     // Creating multiple threads by extending Thread class
     MyThread thread1 = new MyThread();
     MyThread thread2 = new MyThread();

     // Start the threads
     thread1.start();
     thread2.start();
 }
}
