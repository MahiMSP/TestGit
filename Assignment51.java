package MKT;

public class Assignment51 
{
	//check if the given string contains space

		public static void main(String[] args) {
			String str="Mahesh here";
			
			
			char ch[]= str.toCharArray();
			boolean flag=true;
			for (int i = 0; i < ch.length; i++) 
			{
				 boolean s=Character.isSpace(ch[i]);
				 if(s)
				 {
					 System.out.println("There is space");
					 flag=false;
					 break;
				 }
			}
			if(flag)
			{
				
				System.out.println("No space");
			}

		}


}
