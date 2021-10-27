package javaPrograms;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IndexOfFirstNonRepCharInAxting 
{
	public static void main(String[] args) 
	{
		String s="GeeksforGeeks";
		char[] arr=s.toCharArray();
		Map<Character,Integer> m = new LinkedHashMap<Character,Integer>();
		for(Character ch:arr) 
		{
			Integer count=m.get(ch);
			if(count==null) 
			{
				m.put(ch, 1);
			}
			else 
			{
				m.put(ch, ++count);
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
