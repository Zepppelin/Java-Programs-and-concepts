package dsawithkunal;

public class KthFibonacciNumber 
{

	public static int fibo(int num) 
	{
		if(num<2)
		{
			return num;
		}
		return fibo(num-1)+fibo(num-2);
	}
	

	public static void main(String[] args) 
	{
		int num = 10;
		System.out.println(fibo(num));
	}
	
}