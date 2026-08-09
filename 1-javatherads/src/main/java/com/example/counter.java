public class Counter {

    private int c = 0;

    public void increment() {
        c++;
    }

    public void decrement() {
        c--;
    }

    public int getValue() {
        return c;
    }
}

public class ThreadCounter implements Runnable {
	Counter c;
	int times;

	ThreadCounter(Counter c, int times)  { 
//1. Initialize the thread
	}

	@Override
	public void run() {

		for (int i = 1; i <= this.times; i++) {
			try {
				Thread.sleep(100); //wait 0,1 s
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			c.increment();
		}
	}


	public static void main(String[] args) throws Exception {

		int times = 10;

//2. Create a counter object
		Counter counter = … ;

//3. Create a thead1 that increment 10 times the counter
		Thread thCounter1 = new Thread (…);
		
//4. start the counter thread 
	
		//5. main waits for the counter thread to end.
	 
//6. main thread prints the final value of the counter
		System.out.println("Sum = " + counter.getValue());
	}
}
