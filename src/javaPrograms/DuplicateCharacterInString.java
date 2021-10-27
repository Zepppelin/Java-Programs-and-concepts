package javaPrograms;

public class DuplicateCharacterInString 
{

	public static void main(String[] args) 
	{
		String s ="ajeetgt";
		
		for(int i=0;i<s.length()-1;i++) 
		{
			for(int j=i+1;j<s.length();j++) 
			{
				if(s.charAt(i)==s.charAt(j)) 
				{
					System.out.println(s.charAt(j)+" "+"is duplicate");
				}
			}
		}

	}

}
