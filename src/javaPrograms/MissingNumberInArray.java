package javaPrograms;

public class MissingNumberInArray{
public static void main(String[] args)
{
	int[] arr = {1,2,3,4,6,7,8,9,10};
	int ArraySum1=0;
	int ArraySum2=0;
	for(int i=0;i<arr.length;i++) 
	{
		ArraySum1=ArraySum1+arr[i];
	}
	for(int i=1;i<=10;i++)
	{
		ArraySum2 = ArraySum2+i;
	}
	
	System.out.println("Missing number in an array is"+" " +(ArraySum2-ArraySum1));

}
}
