package MKT;

import java.util.Scanner;

public class Assignment7 
{
	static int add(int a, int b)
	{
		System.out.println(a+b);
	}
	static void sub(int a, int b)
	{
		System.out.println(a-b);
	}
	static void multi(int a, int b)
	{
		System.out.println(a*b);
	}
	static void div(int a, int b)
	{
		System.out.println(a/b);
	}
	static void modulus(int a, int b)
	{
		System.out.println(a%b);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a and b");
		int a=sc.nextInt();
		int b=sc.nextInt();
		add(a,b);
		sub(a, b);
		multi(a, b);
		div(a, b);
		modulus(a, b);
}

}
