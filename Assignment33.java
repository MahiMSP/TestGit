package MKT;

class parent 
{
	void love() 
	{
		System.out.println("Love your parent");
	}
}

class child1 extends parent 
{
	void unmature() 
	{
		System.out.println("child1 is unmature");
	}
}

public class Assignment33 extends parent 
{
	void money() 
	{
		System.out.println("Parent have money");
	}
	
	public static void main(String[] args) 
	{
		Assignment33 a = new Assignment33();
		a.money();
		child1 c = new child1();
		c.unmature();
		c.love();
	}
}

