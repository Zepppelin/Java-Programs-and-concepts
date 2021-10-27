package javaPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class FindSecondIndexOfRepeatedCharacterInAString {

	public static void main(String[] args) 
	{
		String s="GeeksforGeeks";
		char[] arr=s.toCharArray();
		Map<Character,Integer> m = new HashMap<Character,Integer>();
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j] && m.containsKey(arr[i])==false)
				{
					m.put(arr[i], j);
				}
			}
		}	
			
		Set<Entry<Character,Integer>> st=m.entrySet();
			for(Entry<Character,Integer> entry:st) 
			{
					System.out.println("Index of repeated character"+ " "+entry.getKey()+" "+"is"+" "+entry.getValue());
				
			}
	}

}
