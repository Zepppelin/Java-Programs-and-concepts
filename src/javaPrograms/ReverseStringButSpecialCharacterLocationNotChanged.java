package javaPrograms;

public class ReverseStringButSpecialCharacterLocationNotChanged 
{

	public static void main(String[] args)
	{
		String s = "kumar.ajeet@siemens-healthineers.com";
		char[] arr=s.toCharArray();
		int i=0;
		int j=arr.length-1;
		while(i<j) 
		{
			if(!(arr[i]>='a' && arr[i]<='z')) 
			{
				i++;
			}
			else if(!(arr[j]>='a' && arr[j]<='z'))
			{
				j--;
			}
			else 
			{
				char temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
		}
		//return String.valueOf(arr);
		String str = new String(arr);
		System.out.println(str);
	}

}
