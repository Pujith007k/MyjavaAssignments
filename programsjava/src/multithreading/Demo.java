package multithreading;


	public class Demo extends Thread{
		//Extends the Thread class
		public void run() {
			for(int i=0;i<=5;i++)
				System.out.println(i+" "+Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		public static void main(String[] args) {
			Demo ins1=new Demo();
			Demo ins2=new Demo();
			
			ins1.setName("First");
			ins2.setName("Second");
			
			ins1.start();
			ins2.start();
			
		}
	}


