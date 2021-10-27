package javaPrograms;

public class ConvertUpperCaseStringToLowerCase
{

	public static void main(String[] args)
	{
		String s = "AJEET";
		char[] arr=s.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(char)(arr[i]+32);
		}
		System.out.println(s);
		System.out.println(arr);

	}

}
