package ThreadP;

import java.util.concurrent.ConcurrentHashMap;

public class Machine implements Runnable{

	Operator op;
	
	public Machine(Operator op)
	{
		this.op=op;
	}
	
	public static void main(String[] args) {
		
		/*ConcurrentHashMap chm = new ConcurrentHashMap(); 
		chm.put(1, "Nayan");
		chm.put(2, "AAAAAA");
		chm.put(3, "BBBBBB");
		chm.put(4, "CCCCC");
		*/
		
		
		
		Operator op = new Operator();
		new Thread(new Machine(op)).start();
		new Thread(op).start();

	}

	public void run()
	{
	/*	while(true)
		{*/
			synchronized(op)
			{
				try {
					System.out.println("Thread is waiting....");
					
					op.wait();
					
					System.out.println("Thread  waiting is over....");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
//			}
		}
	}
}
