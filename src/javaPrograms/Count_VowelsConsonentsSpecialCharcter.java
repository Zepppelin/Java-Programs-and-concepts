package javaPrograms;

public class Count_VowelsConsonentsSpecialCharcter
{

	public static void main(String[] args) 
	{
		String s = "ARADHYA'S BRILLIANCE CENTER";
		char[] arr=s.toCharArray();
		int Vowels=0;
		int Consonents=0;
		int SpecialCharcter=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>='A' && arr[i]<='Z') 
			{
				if(arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U') 
				{
					++Vowels;
				}
				else 
				{
					++Consonents;
				}
			}
			else
			{
				++SpecialCharcter;
			}
		}
		System.out.println("Number of Vowels present:"+" "+Vowels);
		System.out.println("Number of Consonents present:"+" "+Consonents);
		System.out.println("Number of SpecialCharcter Present:"+" "+SpecialCharcter);
		

	}

}
