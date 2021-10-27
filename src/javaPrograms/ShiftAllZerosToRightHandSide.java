package javaPrograms;

import java.util.Arrays;

public class ShiftAllZerosToRightHandSide
{

	public static void main(String[] args) 
	{
		int[] arr = {0,3,0,5,9,10,4,0,5,0,3};
		for(int i=0;i<arr.length-1;i++) 
		{
			for(int j=i+1;j<arr.length;j++) 
			{
				if(arr[i]==0) 
				{
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
					
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
