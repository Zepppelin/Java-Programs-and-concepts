package javaPrograms;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters 
{
	public static void main(String[] args) 
	{
		String s = "abcabcbb";
		char[] arr=s.toCharArray();
		String currentmax="";
		String overAllMax="";
		Set<Character> st = new HashSet<Character>();
		for(Character c:arr)
		{
			if(st.contains(c)) 
			{
				st.clear();
				currentmax="";
			}
				st.add(c);
				currentmax=currentmax+c;
				if(currentmax.length()>overAllMax.length())
				{
					overAllMax=currentmax;
				}	
		}
		System.out.println(overAllMax);
		System.out.println(overAllMax.length());
		
		
		
	}
}
