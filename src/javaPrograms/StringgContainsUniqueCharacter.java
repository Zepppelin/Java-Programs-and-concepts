package javaPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class StringgContainsUniqueCharacter 
{

	public static boolean stringContainsUniqueCharacter(String str) 
	{
		
		char[] arr=str.toCharArray();
		Map<Character,Integer> m = new HashMap<Character,Integer>();
		boolean status=false;
		for(Character c:arr)
		{
			Integer count=m.get(c);
			if(count==null) 
			{
				m.put(c, 1);
			}
			else 
			{
				m.put(c, ++count);
			}
		}
		
		Set<Entry<Character,Integer>> es=m.entrySet();
		for(Entry<Character,Integer> entry :es)
		{
			if(entry.getValue()==1) 
			{
				status=true;
			    
			}
           else
			{
        	   status =false;
				break;
			}
			
	     }
		return status;
//		if(status==false) 
//		{
//			System.out.println(str+" "+"not contains unique characters");
//		}
//		else if(status==true)
//		{
//			System.out.println(str+" "+"contains unique characters");
//		}
		
	}
	public static void main(String[] args)
	{
		boolean ans=stringContainsUniqueCharacter("keep");
		boolean ans1=stringContainsUniqueCharacter("world");
		System.out.println(ans);
		System.out.println(ans1);
	}
}



/*public static void main(String[] args)
{
	Scanner scn = new Scanner(System.in); 
	System.out.println("Enter the string: ");
	String str=scn.nextLine();
	boolean status=false;
	for(int i=0;i<str.length();i++) 
	{
		for(int j=i+1;j<str.length();j++) 
		{
			if(str.charAt(i)!=str.charAt(j)) 
			{
				status=true;
			}	
			else 
			{
				status=false;
				break;
			}
		}
		if(status==false)
		{
			break;
		}
	}
    if(status ==true) 
    {
	System.out.println("String contains unique charcaters");
    }
    else
    {
	System.out.println("String not contains unique charcaters");
    }
			
}

}*/