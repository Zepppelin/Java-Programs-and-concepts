package javaPrograms;

public class AddTwoArrayMatrix {

	public static void main(String[] args) 
	{
		int [][] arr = {{1,2,8},{4,5,6}}; // 1 2    5 6    6 8    //inner element represents the number of columns
		                               //3 4    7 8    10 12
		int[][] arr1= {{2,3,2},{5,4,1}}; // number set represents the number of rows
		int [][] temp=new int[2][3];
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=0;j<arr[i].length;j++) 
			
			{
				temp[i][j]=(arr[i][j]+arr1[i][j]); 
			     System.out.print(temp[i][j]+ " ");
			}
			System.out.println();
		}
		
	
	}

}
