package ThreadP;

public class Operator implements Runnable{

	@Override
	public void run() {
//		while(true)
//		{
			synchronized(this)
			{
				System.out.println("Notify the thread....");
				notify();
			}
		}
		
//	}



}
