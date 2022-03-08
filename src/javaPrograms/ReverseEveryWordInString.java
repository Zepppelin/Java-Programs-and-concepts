package javaPrograms;

public class ReverseEveryWordInString 
{

	public static void main(String[] args) 
	{
		String s = "Bala is sexy";
		String[] arr=s.split(" ");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}

	}

}

//public class Test1 
//{
//	
//	public static void main(String[] args) 
//	{
//		String s = "Bala is sexy";
//		String[] arr=s.split(" ");
//		int i=0;
//		int j=arr.length-1;
//		
//		while(i<j)
//		{
//			String temp=arr[j];
//			arr[j]=arr[i];
//			arr[i]=temp;
//			i++;
//			j--;
//		}
//		
//				
//				
//		
//		
//	}
//
//}
