package ThreadP;

public class Reader implements Runnable {

	
	Calculator c;
	
	public Reader(Calculator c)
	{
		this.c=c;
	}
	
	
	public static void main(String[] args) {
		Calculator c = new Calculator();
		new Thread(new Reader(c)).start();
		new Thread(new Reader(c)).start();
		new Thread(new Reader(c)).start();
		new Thread(new Reader(c)).start();
		new Thread(c).start();

	}

	@Override
	public void run() {
		synchronized(c)
		{
			try {
				System.out.println("Waiting for the calcualtion ....");
				c.wait();
				
			}
			catch(InterruptedException e) {}
			
			System.out.println("Total amount is : " + c.total);
		}
		
		
	}

}
