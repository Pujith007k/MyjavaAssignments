package exceptionhandling;

public class Demo extends Exception {
	
	
		
		private String msg;
		
		public Demo(String msg) {
			this.msg=msg;
		}
		@Override
		public String toString() {
			return"Demo [Message=" + msg + "]";
		}
	}
	


