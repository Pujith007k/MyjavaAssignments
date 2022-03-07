package constructors;

 class Constmain{
	int age;
	String colour;
	int eyesno;
	
	Constmain(int i,String c,int en)
	{
		 age=i;
		 colour=c;
		 eyesno=en;
		 }
	void display()
	{
		System.out.println(age);
		System.out.println(colour);
		System.out.println(eyesno);
		System.out.println("-------");
		
	}
}


	public class Const{
	public static void main(String[] args) 
	{
	Constmain c1=new Constmain(28,"white",2);
	Constmain c2=new Constmain(47,"brown",1);
	c1.display();
	c2.display();
	}
	}
	
	

