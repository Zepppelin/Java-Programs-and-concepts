package overiding;

public class Main extends Bank
{

	public static void main(String[] args) 
	{
		Bank b = new Bank();
		Bank b1 = new SBI();
		Bank b2 = new Axis();
		Bank b3 = new Icici();
		System.out.println(b1.getRateOfInterest());
		System.out.println(b2.getRateOfInterest());
		System.out.println(b3.getRateOfInterest());

	}

}
