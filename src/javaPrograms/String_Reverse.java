package javaPrograms;

public class String_Reverse 
{

	public static void main(String[] args)
	{
		String ori = "selenium";
		String rev ="";
		for(int i=ori.length()-1;i>=0;i--) 
		{
			rev = rev+ori.charAt(i);
		}
		System.out.println(rev);
		
	}
	
	

}
