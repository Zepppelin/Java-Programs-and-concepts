package javaPrograms;

import java.util.Scanner;

public class Factorial2 
{
	static int fact=1;
	public static int factorial(int num)
	{
		if(num<=1)
		{
			return 1;
		}
		else 
		{
			fact=fact*num;
			factorial(num-1);
		}
		return fact;
	}
	public static void main(String[] args)
	  {
		 System.out.println(factorial(5));
	  }
}