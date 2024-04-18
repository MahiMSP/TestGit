package MKT;

class A
{
	void fruit() 
	{
		System.out.println("This is fruit");
	}
}

class B extends A
{
	void Kivi() 
	{
		System.out.println("This is kivi");
	}
}
public class Assignment32 extends B
{
	void good() 
	{
		System.out.println("Its kivi and good for us");
	}
	
	public static void main(String[] args) 
	{
		Assignment32 a=new Assignment32();
		a.fruit();
		a.Kivi();
		a.good();
	}
}
