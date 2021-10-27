package javaPrograms;

public class TwoArraysEqualOrNot 
{
	public static void main(String[] args) 
	{
		int[] x= {1,2,3,4,5};
		int[]y= {1,2,3,4,5};
		boolean status=false;
		for(int i=0;i<x.length;i++) 
		{
				if(x[i]!=y[i] || x.length!=y.length)
				{
					status=false;
					break;
				}
			status=true;	
		}
		
		if(status==true) 
		{
			System.out.println("Arrays x and y are equal");
		}
		else 
		{
			System.out.println("Arrays x and y are not equal");
		}
	}

}


/*public static void main(String[] args)
{
	int [] arr = {1,2,3,4,5};
	int [] arr1= {1,2,3,4,1};
	boolean status = true;
	for(int i=0;i<arr.length;i++) 
	{
		if(arr[i]==arr1[i] && arr.length==arr1.length) 
		{
			
			status = true;
		}
		else
		{
			status = false;
			break;
		}
		
	}
	if(status ==true) 
	{
		System.out.println("Arrays are equal");
	}
	else 
	{
		System.out.println("Arrays are not equal");
	}
}

}*/


//public class Test 
//{ 
//	public static boolean isEqual(int[] arr,int[] mtr)
//	{
//		if(arr.length!=mtr.length) 
//		{
//			return false;
//		}
//		else
//		{
//			for(int i=0;i<arr.length;i++)
//			{
//				if(arr[i]!=mtr[i])
//				{
//					return false;
//				}
//			}
//		}
//		return true;
//	}
//	
//	 public static void main(String[] args) 
//	 {
//		 int [] arr= {1,2,3,4,5,6};
//		 int [] mtr= {1,2,3,4,5,6};
//		 System.out.println(isEqual(arr,mtr));
//		 
//	 }
//} 
