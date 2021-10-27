package customizedException;

import java.util.Scanner;

public class Tests 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the Age:");
		int Age=scn.nextInt();
		if(Age>60)
		{
			throw new AgeExp("Age value do not fall in the range");
		}

	}

}
