package practice;

public abstract class Bank 
{
   public abstract int getRateOfInterest();
}

class ICICI extends Bank
{
	public int getRateOfInterest() 
	{
		return 10;
	}
}

class AXIS extends Bank
{
	public int getRateOfInterest() 
	{
		return 11;
	}
}

class SBI extends Bank
{
	public int getRateOfInterest() 
	{
		return 12;
	}
}
