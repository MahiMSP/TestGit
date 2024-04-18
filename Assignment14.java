package MKT;

public class Assignment14 
{
	//How to call non-static method inside a main method
	   void add() 
	   {
		   System.out.println("Hi i am non static method");
		   // in above line non static method called through object reference
	   }
	   
		public static void main(String[] args) {
		
			Assignment15 s=new Assignment15();
			s.add();
	   
		}


}
