package ibm;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateCharacterInaString 
{

	public static void main(String[] args)
	{
		String string = "interview";
		StringBuffer sb = new StringBuffer();
		char[] arr=string.toCharArray();
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for(Character ch : arr ) 
		{
			Integer count =map.get(ch);
			if(count==null)
			{
				map.put(ch,1);
			}
			else 
			{
				map.put(ch,++count);
			}
		}
		Set<Entry<Character,Integer>> set=map.entrySet();
		for(Entry<Character,Integer> entry:set) 
		{
			if(entry.getValue()>1)
			{
				sb.append(entry.getKey());
			}
		}
		System.out.println(sb.toString());

	}

}
