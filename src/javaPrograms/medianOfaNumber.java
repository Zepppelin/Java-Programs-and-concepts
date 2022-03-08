package javaPrograms;

public class medianOfaNumber 
{

	public static int medianofNumber(int[] arr)
    {
		int start=0;
		int end = arr.length-1;
		int result=(start+end)/2;
		
       for(int i=0;i<arr.length;i++)
       {
    	   for(int j=i+1;j<arr.length;j++)
    	   {
    		   if(arr[i]>arr[j]) 
        	   {
        		   int temp=arr[j];
        		   arr[j]=arr[i];
        		   arr[i]=temp;
        	   }  
    	   }
    	   
       }
       if(arr.length%2==0) 
       {
    	   
    	   return (arr[result]+arr[result+1])/2;
       }
       else 
       {
    	 
    	   return arr[result];
       }
  
    }
	
	public static void main(String[] args)
	{
		//int[] a= {90, 100, 78, 89, 67};
		int[] a = {56, 67, 30, 79};
		System.out.println(medianofNumber(a));
        
	}
}
