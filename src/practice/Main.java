package practice;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter the age:");
		int age=scn.nextInt();
		if(age>50)
		{
			throw new AgeExp("too old");
		}
		else
		{
			System.out.println("you are under age");
		}
			

	}

}
