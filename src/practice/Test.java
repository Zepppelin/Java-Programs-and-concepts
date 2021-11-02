package practice;
import java.util.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicIntegerArray;

public class Test 
{ 
	public static void reverse(String s) 
	{
		if(s.length()<=0 || s==null)
		{
			System.out.println(s);
		}
		else 
		{
			System.out.print(s.charAt(s.length()-1));
			reverse(s.substring(0, s.length()-1));
		}
	}
		
	 public static void main(String[] args) 
	 {
		 String s = "this is how";
		 reverse(s);
		 
	 
	 }
	 
} 
