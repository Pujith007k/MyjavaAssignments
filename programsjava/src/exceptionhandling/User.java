package exceptionhandling;

public class User {
	
	static void check(int age) throws Demo
	{
		
		if(age>18)
			throw new Demo("elligible for voting");
		else
			throw new Demo("not elligible");
}
	
	public static void main(String[] args) {
		try
		{
			check(35);
		}
		catch(Demo e)
		{
			System.out.println(e);
		}
	}

}
