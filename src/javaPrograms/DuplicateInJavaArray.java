package javaPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class DuplicateInJavaArray
{

	public static void main(String[] args) 
	{
		String[] arr={"java","javaScript","Ruby","c","python","java"};
		Map<String,Integer> m = new HashMap<String,Integer>();
		for(String c:arr) 
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
		Set<Entry<String,Integer>> st=m.entrySet();
		for(Entry<String,Integer> entry:st) 
		{
			if(entry.getValue()>1) 
			{
				System.out.println("Duplicate in string is"+" "+entry.getKey());
			}
		}
		
	}

}

