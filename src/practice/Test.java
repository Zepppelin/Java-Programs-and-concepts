package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.WeakHashMap;

public class Test 
{
	public static void main(String[] args)
	{
	
		for(int i=1;i<=5;i++) 
		{
			for(int j=1;j<=i;j++) 
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		for(int i=1;i<=4;i++) 
		{
			for(int j=1;j<=5-i;j++) 
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
			
		
		
	}
}
