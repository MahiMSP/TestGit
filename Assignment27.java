package MKT;

import java.util.Scanner;

public class Assignment27 
{
	//create 5 methods for addition , subtraction , multiplication ,divison , modulus using scanner class with global variable
	
	    static Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) 
	    {
	        
	        System.out.print("Enter first number: ");
	        int a = scanner.nextInt();

	        System.out.print("Enter the second number: ");
	        int b = scanner.nextInt();

	  
	        System.out.println("Addition: " + add(a, b));
	        System.out.println("Subtraction: " + subtract(a, b));
	        System.out.println("Multiplication: " + multiply(a, b));
	        System.out.println("Division: " + div(a, b));
	       

	    }

	    public static int add(int a, int b) 
	    {
	        return a + b;
	    }

	   
	    public static int subtract(int a, int b) 
	    {
	        return a - b;
	    }

	    public static int multiply(int a, int b) 
	    {
	        return a * b;
	    }

	    public static int div(int a, int b) 
		{
		return a/b;
		}
}

