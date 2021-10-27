package javaPrograms;
import java.util.Arrays;
public class ShiftAllZerosAndOnes
{
	public static void main(String[] args) 
	{
		int[] arr = {1,0,1,1,0,0,1,0};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++) 
			{
				if(arr[i]>arr[j])
				{
					
					int x=arr[j];
					arr[j]=arr[i];
					arr[i]=x;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
