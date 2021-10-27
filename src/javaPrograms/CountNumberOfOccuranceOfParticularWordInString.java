package javaPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountNumberOfOccuranceOfParticularWordInString {

	public static void main(String[] args) 
	{
		String str ="a cat a dog a rat a cat";
		String[] arr=str.split(" ");
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
		Set<Entry<String,Integer>> s=m.entrySet();
		for(Entry<String,Integer> entry:s) 
		{
			System.out.println(entry.getKey()+" "+"appers"+" "+entry.getValue()+" "+ "times");
		}

	}

}
