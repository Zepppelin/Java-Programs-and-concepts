package javaPrograms;

public class CovertEachWordOfStringIntoUpperCase {

	public static void main(String[] args) {
		String s="java is programming language";
		char[] arr=s.toCharArray();
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i]!=' ') 
			{
				arr[i]=(char)(arr[i]-32);
				
			}
		}
		System.out.println(s);
		System.out.println(arr);
		

	}

}
