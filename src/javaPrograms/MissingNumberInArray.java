package javaPrograms;

public class MissingNumberInArray{
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,6,7,8,9,10};
		int sum=0;
		int sum1=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		for(int i=1;i<=10;i++) {
			sum1=sum1+i;
		}
		System.out.println(sum1-sum);
	}
	
}	