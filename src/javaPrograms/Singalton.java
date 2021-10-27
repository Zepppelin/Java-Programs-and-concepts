package javaPrograms;

public class Singalton 
{

	private static Singalton t=null;
	private Singalton() 
	{
		
	}
	public static Singalton getSingalton()
	{
		if((t==null)) 
		{
			t=new Singalton();
		}
		return t;
	}

	public static void main(String[] args)
	{
		Singalton t1= Singalton.getSingalton();
		Singalton t2 =  Singalton.getSingalton();
		Singalton t3 =  Singalton.getSingalton();
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		System.out.println(t3.hashCode());

	}

}

