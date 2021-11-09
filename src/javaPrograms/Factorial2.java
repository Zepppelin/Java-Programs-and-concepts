package javaPrograms;

import java.util.Scanner;

public class Factorial2 
{
	static int fact=1;
	public static int fact(int num)
	{
		if(num==0) 
		{
			return 1;
		}
		else 
		{
			if(num>=1)
			{
				fact=fact*num;
				fact(num-1);
			}
		}
		return fact;
		
	}
	 public static void main(String[] args) 
	 {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=scn.nextInt();
		System.out.println(fact(num));
		
	 }
} 