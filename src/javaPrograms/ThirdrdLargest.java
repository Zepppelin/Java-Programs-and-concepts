package javaPrograms;

import java.util.Arrays;

public class ThirdrdLargest 
{

	public static void main(String[] args) 
	{
		int[] arr = {1,3,2,5,7,9};
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=i+1;j<arr.length;j++) 
			{
				if(arr[i]>arr[j]) 
				{
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
			
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("array sorted");
		System.out.println("Third largest number in an array is"+" "+arr[arr.length-3]);

	}

}
