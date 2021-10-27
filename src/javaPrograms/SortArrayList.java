package javaPrograms;

import java.util.ArrayList;
import java.util.List;

public class SortArrayList {

	public static void main(String[] args) 
	{
		List<Integer> lst = new ArrayList<Integer>();
		lst.add(100000);
		lst.add(300);
		lst.add(1);
		lst.add(1);
		for(int i=0;i<lst.size();i++) 
		{
			for(int j=i+1;j<lst.size();j++)
			{
				if(lst.get(i)>lst.get(j)) 
				{
					int temp=lst.get(j);
					lst.set(j, lst.get(i));
					lst.set(i, temp);
					
				}
			}
		}
		
		System.out.println(lst);
	}
}