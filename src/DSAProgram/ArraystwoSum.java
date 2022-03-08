package DSAProgram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArraystwoSum
{
	public static int[] twoSum(int[] arr, int target)
	{
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++)
		{
			int complement = target-arr[i];
			if(map.containsKey(complement)) 
			{
				return new int[] {map.get(complement),i};
			}
			else
			{
				map.put(arr[i], i);
			}
			
		}
		return null;
	}
	public static void main(String[] args)
	{
		int[] arr = {2,11,13,7};
		int target = 9;
		int[] ans=twoSum(arr,9);
		System.out.println(Arrays.toString(ans));
		

	}

}
