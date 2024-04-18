package MKT;

public class Assignment16 
{
	//Write a program to check if gender equals to male or female.If it is male and check if age is greater 
	//than 18 or not.if it is greater than 18 then the person is eligible to vote otherwise not eligible to
	//vote.If it is female and check if age is greater than 18 or not.If the age is greater than 18 then the person is
	//eligible to vote otherwise not eligible to vote 
	
		public static void main(String[] args) 
		{
			
		   String gender="Female";
		   int age=22;
		   if(gender=="Male")
		   {
			  if(age>=18)
			  {
				 System.out.println("Male is eligible to vote"); 
			  }
			  else {
				  System.out.println("male is not eligible to vote");
			  }
		   }
		   else {
			   if(age>=18)
				  {
					 System.out.println("Female is eligible to vote"); 
				  }
				  else {
					  System.out.println("female Not eligible to vote");
				  }
		   }



		}}
