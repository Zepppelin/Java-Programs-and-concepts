package DataStructuresAndAlgorithms;

import java.util.Arrays;

public class CyclicSort 
{
	public static void sort(int[] arr) 
	{
		int i =0;
		while(i<arr.length) 
		{
			int correctIndex= arr[i]-1;
			if(arr[i]!=arr[correctIndex]) 
			{
				swap(arr,i,correctIndex);
				
			}
			else
			{
				i++;
			}
		}
	}
	public static void swap(int[] arr, int first, int second) 
	{
		int temp=arr[second];
		arr[second]=arr[first];
		arr[first]=temp;
	}
    //when given numbers from range 1 to N => use cyclic sort
	public static void main(String[] args)
	{
		int[] arr = {3,5,2,1,4};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	

}
