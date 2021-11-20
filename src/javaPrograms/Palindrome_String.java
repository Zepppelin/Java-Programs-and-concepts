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

//public class Test 
//{
//	
//	public static void main(String[] args)
//	{ 
//		String s = "madam";
//		int i=0;
//		int j=s.length()-1;
//		boolean status=true;
//		while(i<=j)
//		{
//			if(s.charAt(i)==s.charAt(j)) 
//			{
//				status=true;
//				i++;
//				j--;
//			}
//			else
//			{
//				status=false;
//				break;
//			}
//		}
//		if(status==true) {
//			System.out.println("palindrome");
//		}
//		else {
//			System.out.println("not palindrome");
//		}
//	}
//}

