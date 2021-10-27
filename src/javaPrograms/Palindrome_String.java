package javaPrograms;

public class Palindrome_String {
	

	public static void main(String[] args) 
	{
		String original = "MaDaM";
		String rev="";

		for(int i=original.length()-1;i>=0;i--) 
		{
			rev = rev+original.charAt(i);
		}
		System.out.println(rev);
		if(original.equalsIgnoreCase(rev)) 
		{
			System.out.println("The given string is palindromne");
		}
		else 
		{
			System.out.println("The given string is not palindrome");
		}
	}
	
	
	
}
