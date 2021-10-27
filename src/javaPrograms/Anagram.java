package javaPrograms;

import java.util.Arrays;

public class Anagram {
	public static void isAnagram(String s1,String s2) 
	{
	   String str1=s1.replaceAll("\\s", "");
	   String str2=s2.replaceAll("\\s", "");
	   boolean status = true;
	   if(str1.length()!=str2.length()) 
	   {
		   status = false;
	   }
	   else 
	   {
		  char[] StringArray1= str1.toLowerCase().toCharArray();
		  char[] StringArray2= str2.toLowerCase().toCharArray();
		  Arrays.sort(StringArray1);
		  Arrays.sort(StringArray2);
		  status=Arrays.equals(StringArray1, StringArray2);
		}
	   if(status==true)
	   {
		   System.out.println(s1+ " "+ s2+" "+"is anagram");
	   }
	   else 
	   {
		   System.out.println(s1+ " "+ s2+" "+"is not anagram");
	   }
	}


	public static void main(String[] args) 
	{
		isAnagram("Keep","Peek");
		isAnagram("Keep","ajjk");
		
		
	}

}
