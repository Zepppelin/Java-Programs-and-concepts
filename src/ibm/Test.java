package ibm;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test 
{
	
	public static void main(String[] args) 
	{
		int num = 1004;
		int sum=0;
		while(num>0) 
		{
			int  r = num%10;
			if(r!=0) 
			{
				sum = sum+r;
			}
		}

	}

}
