package Lab2;



//lab 2  1b

public class Threads extends Thread {
	
	public void run() {
	    System.out.println("This code is running in a thread");
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threads t= new Threads();
		t.start();
		
		System.out.println("This code is outside of the thread");
	

	}

}
