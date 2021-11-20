package practice;

class Bank 
{
	public int getRateOfInterest()
	{
		return 0;
		
	}
}

class ICICI extends Bank
{
	public int getRateOfInterest()
	{
		return 10;
	}
}

class SBI extends Bank
{
	public int getRateOfInterest()
	{
		return 11;
	}
}

class AXIS extends Bank
{
	public int getRateOfInterest()
	{
		return 12;
	}
}
