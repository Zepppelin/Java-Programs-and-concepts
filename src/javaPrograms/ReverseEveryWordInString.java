package javaPrograms;

public class ReverseEveryWordInString 
{

	public static void main(String[] args) 
	{
		String s = "Bala is sexy";
		String[] arr=s.split(" ");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
