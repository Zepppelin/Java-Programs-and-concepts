package javaPrograms;

import java.util.Arrays;

public class FindSecondLargestWordInAGivenString
{
	
	public static void main(String[] args) 
	{
		String s = "i i good or not";
		String [] arr=s.split(" ");
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=i+1;j<arr.length;j++) 
			{
				if(arr[i].length()>arr[j].length()) 
				{
					String s1=arr[j];
					arr[j]=arr[i];
					arr[i]=s1;
				}
			}
		}
		System.out.println(arr[(arr.length)-2]);
	}

}
