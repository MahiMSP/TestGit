package MKT;

import java.util.Date;

public class Assignment42 
{
	//write a program to get 10 days before the current time 
	//and 10 days after the current time using Date Class?


		public static void main(String[] args) {
		Date d=new Date();
		//next 10 days 
		Date d1=new Date(d.getTime()+(1000*60*60*24*10));
		System.out.println(d);
		
		//past 10 days
		Date d2=new Date(d.getTime()-(1000*60*60*24*10));
		
		System.out.println(d1);
		System.out.println(d2);

		}
}
