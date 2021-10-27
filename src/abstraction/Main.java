package abstraction;

public class Main
{

	public static void main(String[] args) 
	{
		ICICI b = new ICICI();
		SBI b1= new SBI();
		System.out.println(b.getRateOfInterest());
		System.out.println(b1.getRateOfInterest());

	}

}
