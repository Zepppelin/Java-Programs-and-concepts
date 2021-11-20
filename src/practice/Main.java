package practice;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args) 
	{
		
		ICICI i = new ICICI();
		SBI s = new SBI();
		AXIS a = new AXIS();
		
		System.out.println(i.getRateOfInterest());
		System.out.println(s.getRateOfInterest());
		System.out.println(a.getRateOfInterest());
		

	}

}
