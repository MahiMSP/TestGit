package MKT;

public class Assignment15 
{

	public void add() 
	{
		System.out.println("Its non static method");
		// non static method called through object reference
		   
	}
			
	public static void main(String[] args) 
	{
			
		Assignment15 s=new Assignment15();
		s.add();
		   
	}

		
}


