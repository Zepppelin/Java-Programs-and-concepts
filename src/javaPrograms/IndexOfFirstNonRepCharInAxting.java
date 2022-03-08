package javaPrograms;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IndexOfFirstNonRepCharInAxting 
{
	public static void main(String[] args) 
	{
		String s="ajeetkumar";
		char[] arr=s.toCharArray();
		Map<Character,Integer> m = new HashMap<Character,Integer>();
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
		Set<Entry<Character,Integer>> st=m.entrySet();
		
		for(Entry<Character,Integer> entry:st) 
		{
			if(entry.getValue()==1) 
			{
				System.out.println("First non repeating character in a string is"+" "+entry.getKey());
	            System.out.println(s.indexOf(entry.getKey()));
				break;
			}
		
			
		}
		

	}

}


//public class Test
//
////Index of first non repeating character in a string using linear search
//{
//	public static int findIndex(String s) 
//	{
//		char[] arr=s.toCharArray();
//		char target='f';
//		for(int i=0;i<arr.length;i++)
//		{
//			if(target==arr[i])
//			{
//				return i;
//			}
//		}
//		return -1;
//	}
//	
//	public static void main(String[] args)
//	
//	{
//		
//		String s ="geeksforgeeks";
//		System.out.println(findIndex(s));
//		
//  }
//  
//}

