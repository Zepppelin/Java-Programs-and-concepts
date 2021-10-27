package javaPrograms;

import java.util.Scanner;

public class EvenOrOdd
{

	public static void main(String[] args)
	{
	    Scanner scn = new Scanner(System.in); 
	    {
	    	System.out.println("Enter the number:");
	    	int num=scn.nextInt();
	    	
	    	if(num%2==0) 
	    	{
	    		System.out.println(num+" "+"is even number");
	    	}
	    	else 
	    	{
	    		System.out.println(num+" "+"is odd number");
	    	}
	    }

	}

}
