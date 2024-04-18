package MKT;


class One
{
	void add() 
	{
		System.out.println("this is Add");
	}
	
}
		
		
class Assignment31 extends One
{
	
		void sub() 
		{
			System.out.println("this is sub");
		}

		public static void main(String[] args) 
		{
			Assignment31 a=new Assignment31();
			a.add();
			a.sub();

		}


}
