package practice;

public class B extends A
{ 
	int sum=20;

	public B() 
	{
	    super();
		
		
	}
	public void cons()
	{
		System.out.println(super.sum);
	}
	
	public static void main(String[] args) 
	{
		
		 B b = new B();
		 b.cons();
	}

}
