package DataStructuresAndAlgorithms;

public class LinearSearch 
{
	
	public static int linearSearch(int[] arr)
	{
		int targetElement=28;
		for(int i=0;i<arr.length;i++) 
		{
			if(targetElement==arr[i])
			{
				return i;
			}
			
		}
		return -1; //Return -1 when target element is not present in the array
	}

	public static void main(String[] args)
	{
		int[] arr = {12,7,8,1,4,28};
		System.out.println(linearSearch(arr));
	}

}
