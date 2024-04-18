package MKT;

class m1
{
	m1()
	{
		System.out.println("Its m1-parent");
	}
}


public class Assignment34 extends m1
{
	Assignment34()
	{
		super();
		System.out.println("child");
	}
	
	public static void main(String[] args) 
	{
		Assignment34 a= new Assignment34();
		System.out.println("Its main method");
	}
	

}
