package practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Test 
{
	public static void main(String[] args)
	{
		String str = "java is a programming lauguage";
		String[] arr=str.split(" ");
		int i=0;
		while(i<arr.length)
		{
			if(arr[i].length()>arr[i+1].length()) 
			{
				String temp=arr[i+1];
				arr[i+1]=arr[i];
				arr[i]=temp;
				i++;
			}
			
		}
		System.out.println(arr[arr.length-2]);
	}
}
