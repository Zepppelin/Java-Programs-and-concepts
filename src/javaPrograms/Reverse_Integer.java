package javaPrograms;

public class Reverse_Integer {

	public static void main(String[] args) 
	{
		int num = 12345;
		
		int sum=0;
		while(num>0) 
		{
			int r = num%10;
			sum = (sum*10)+r;
			num=num/10;
		
		}
		System.out.println(sum);

	}

}
