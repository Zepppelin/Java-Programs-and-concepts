package ibm;

public class SwapStringWithoutUsingThirdVariable
{

	public static void main(String[] args)
	{
		String a = "IBM";
		String b = "interview";
		
		 System.out.println("Strings before swap: a = " + a + " and b = "+b);
		a = a+b;
		b=a.substring(0, a.length()-b.length());
		a=a.substring(b.length());
		
		System.out.println("Strings after swap: a = " + a + " and b = " + b); 

	}

}
