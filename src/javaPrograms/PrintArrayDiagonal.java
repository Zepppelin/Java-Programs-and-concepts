package javaPrograms;

public class PrintArrayDiagonal
{

	public static void printPrimaryDiaginal(int[][] arr, int n) 
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++) 
			{
				if(i==j)
				{
					System.out.println(arr[i][j]+ " ");
				}
			}
		}
			
	}
	public static void printSecondaryDiaginal(int[][] arr, int n) 
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++) 
			{
				if((i+j)==(n-1))
				{
					System.out.println(arr[i][j]+ " ");
				}
			}
		}
			
	}
	public static void main(String[] args) 
	{
		int n = 3;
		int[][] arr = { {1,2,3},
				        {5,6,7},
				        {1,2,3}, };
		printPrimaryDiaginal(arr,n); 
		
		System.out.println("___________");
		printSecondaryDiaginal(arr,n); 
		
	}
	
}


