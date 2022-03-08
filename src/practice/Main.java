package practice;

public class Main 
{

	public static void main(String[] args)
	{
		Bank a = new ICICI();
		Bank b = new AXIS();
		Bank c = new SBI();
		
		System.out.println(a.getRateOfInterest());
		System.out.println(b.getRateOfInterest());
		System.out.println(c.getRateOfInterest());
		

	}

}
