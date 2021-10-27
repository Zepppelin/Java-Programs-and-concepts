package javaPrograms;

public class ConvertFirstLetterOfEachWordOfStringIntoUpperCase 
{

	public static void main(String[] args)
	{
		String s = "java is programming language";
		char[] arr=s.toCharArray();
		arr[0]=(char)(arr[0]-32);
		for(int i=1;i<arr.length;i++) 
		{
			if(arr[i]==' ')
			{
				arr[i+1]=(char)(arr[i+1]-32);
			}
		}
		System.out.println(s);
		System.out.println(arr);
	}
	

}
