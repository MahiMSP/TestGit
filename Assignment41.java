package MKT;

public class Assignment41 
{
	//write a program to check whether the given string is 
	//palindrome or not

		public static void main(String[] args) {
			 String str="nitin";
			 int l=str.length();
			 String rev="";
			 
			 for(int i=l-1;i>=0;i--)
			 {
				 char ch=str.charAt(i);
				 rev=rev+ch;
			 }
			 
			 if(str.equals(rev))
			 {
				 System.out.println("palindrome");
			 }
			 else 
			 {
				System.out.println("not palindrome");
			}
			
		}


}
