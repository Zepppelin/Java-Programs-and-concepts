package javaPrograms;
import java.util.Arrays;
public class ShiftAllZerosAndOnes
{
	 public static void main(String[] args) 
	   {
  	  int[] arr = {0,3,0,5,9,10,4,0,5,0,3};
  	    for(int i=0;i<arr.length;i++)
  	    {
  	    	for(int j=i+1;j<arr.length;j++) 
  	    	{
  	    		if(arr[i]>arr[j])
  	    		{
  	    			int temp =arr[j];
  	    			arr[j]=arr[i];
  	    			arr[i]= temp;
  	    		}
  	    	}
  	    }
  	    System.out.println(Arrays.toString(arr));
      	
	   }
		
}
