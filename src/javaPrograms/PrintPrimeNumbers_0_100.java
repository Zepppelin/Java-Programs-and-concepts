package javaPrograms;

public class PrintPrimeNumbers_0_100 
{
	public static boolean isPrime(int num) 
	{
		if(num<=1) 
		{
			return false;
		}
		for(int i=2;i<num;i++) 
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void getPrimeNumber(int num) 
	{
		for(int i=0;i<=num;i++)
		{
			if(isPrime(i)==true) 
			{
				System.out.print(i+ " ");
			}
		}
	}

	public static void main(String[] args)
	{
		System.out.println(isPrime(7));
		getPrimeNumber(100);
	}

}
