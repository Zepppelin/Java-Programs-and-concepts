package javaPrograms;

import java.util.Arrays;

public class SortTheArrayInDescendingOrder
{

	public static void main(String[] args) {
	int[] arr = {1,3,565,322,5,24554};
	for(int i=0;i<arr.length;i++) 
	{
		for(int j=i+1;j<arr.length;j++) 
		{
			if(arr[i]<arr[j]) 
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
