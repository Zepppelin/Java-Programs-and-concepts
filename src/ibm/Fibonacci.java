package ibm;

public class Fibonacci 
{
	public static void main(String[] args) 
	{
		int [] arr = new int[5];
		arr[0]=0;
		arr[1]=1;
		for(int i=2;i<arr.length;i++) 
		{
			arr[i]=arr[i-1]+arr[i-2];
		}
		for(int num:arr)
		{
			System.out.print(num+" ");
		}
	}

}
