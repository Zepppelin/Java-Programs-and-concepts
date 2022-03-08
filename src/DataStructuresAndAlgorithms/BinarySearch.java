package DataStructuresAndAlgorithms;

public class BinarySearch 
{
	public static int binarySearch(int[] arr) 
	{
		int targetElement=13;// ans=8
		int start=0;
		int end = arr.length-1;
		while(start<=end)
		{
			int mid = (start+end)/2;
			if(targetElement==arr[mid])
			{
				return mid;
			}
			else if(targetElement<arr[mid]) 
			{
				end = mid-1;
			}
			else
			{
				start=mid+1;
			}
		}
		return -1;
	}

	public static void main(String[] args) 
	{
	     int[] arr = {5,6,7,8,9,10,11,12,13,14,15};
	     System.out.println(binarySearch(arr));
	}

}
