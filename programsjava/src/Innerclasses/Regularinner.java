package Innerclasses;

public class Regularinner {
	
		int a=10;
		int b=20;
		//Inner class
	class Inner{
		//Method within inner class
		public void display() {
			System.out.println("Addition="+(a+b));
		}
	}
	public static void main(String[] args) {
		
		Regularinner outer=new Regularinner();
		Regularinner.Inner inner=outer.new Inner();
		
		inner.display();
		
	}	
	}


